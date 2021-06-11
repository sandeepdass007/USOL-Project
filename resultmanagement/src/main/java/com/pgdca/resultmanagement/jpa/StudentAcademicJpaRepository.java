package com.pgdca.resultmanagement.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pgdca.resultmanagement.jdbc.entity.StudentAcademicDetail;

@Repository
public interface StudentAcademicJpaRepository extends JpaRepository<StudentAcademicDetail, String> {

	/**
	 * @param univRegNo
	 * @return List of [{course id, course name, current semester, subject name}]
	 */
	@Query("select ci.id, ci.courseName, sd.currentSemester, si.name"
			+ " from SubjectInfo si"
			+ " left join CourseSubRel csr on csr.courseSubSemCompKey.subjectId = si.id"
			+ " left join CourseInfo ci on ci.id = csr.courseSubSemCompKey.courseId"
			+ " left join StudentDetail sd on sd.courseId = csr.courseSubSemCompKey.courseId and sd.currentSemester = csr.courseSubSemCompKey.semester "
			+ " where sd.universityRegNo = ?1 and sd.currentSemester is not null")
	public List<Object[]> getCourseWiseSubjectNames(final String univRegNo);
	
	/**
	 * @param univRegNo
	 * @param courseId
	 * @return List of [{semester, subject name, marks obtained}]
	 */
	@Query(value = "select csr.semester, si.name as SubjectName, sum(if(rpi.marks is not null, rpi.marks, mm.marks)) as Marks"
			+ " from student_detail sd"
			+ " left join course_sub_rel csr on csr.course_id = sd.course_id"
			+ " left join course_info ci on ci.id = sd.course_id"
			+ " left join subject_info si on si.id = csr.subject_id"
			+ " left join result_info ri on ri.enrollment_no = sd.enrollment_no"
			+ " left join result_status rs on rs.id = ri.result_status_id"
			+ " left join master_marks mm on mm.enrollment_no = sd.enrollment_no and mm.subject_id = ri.subject_id"
			+ " left join reappear_info rpi on rpi.enrollment_no = sd.enrollment_no and rpi.subject_id = ri.subject_id and rpi.subject_distribution_ref_id = mm.subject_distribution_ref_id"
			+ " where si.id = ri.subject_id and rs.status = 'pass' and sd.university_reg_no = ?1 and sd.course_id = ?2"
			+ " group by mm.subject_id"
			+ " order by si.name;", nativeQuery = true)
	public List<Object[]> getStudentSemSubMarks(final String univRegNo, final String courseId);
	
	/**
	 * @param univRegNo
	 * @param courseId
	 * @return List of [{average marks, semester}]
	 */
	@Query(value = "select avg(innertable.total_marks), innertable.semester from (select sum(if(rpi.marks is not null, rpi.marks, mm.marks)) as total_marks, csr.semester as semester"
			+ " from student_detail sd"
			+ " left join course_sub_rel csr on csr.course_id = sd.course_id"
			+ " left join course_info ci on ci.id = sd.course_id"
			+ " left join subject_info si on si.id = csr.subject_id"
			+ " left join result_info ri on ri.enrollment_no = sd.enrollment_no"
			+ " left join result_status rs on rs.id = ri.result_status_id"
			+ " left join master_marks mm on mm.enrollment_no = sd.enrollment_no and mm.subject_id = ri.subject_id"
			+ " left join reappear_info rpi on rpi.enrollment_no = sd.enrollment_no and rpi.subject_id = ri.subject_id and rpi.subject_distribution_ref_id = mm.subject_distribution_ref_id"
			+ " where si.id = ri.subject_id and rs.status = 'pass' and sd.university_reg_no = ?1 and sd.course_id = ?2"
			+ " group by mm.subject_id"
			+ " order by si.name) innertable"
			+ " group by innertable.semester;", nativeQuery = true)
	public List<Object[]> getStudentAvgMarksBySem(final String univRegNo, final String courseId);

	/**
	 * @param univRegNo
	 * @param courseId
	 * @return List of [{class average marks, semester}]
	 */
	@Query(value = "select avg(innertable.total_marks), innertable.semester from (select sum(if(rpi.marks is not null, rpi.marks, mm.marks)) as total_marks, csr.semester as semester"
			+ " from student_detail sd"
			+ " left join course_sub_rel csr on csr.course_id = sd.course_id"
			+ " left join course_info ci on ci.id = sd.course_id"
			+ " left join subject_info si on si.id = csr.subject_id"
			+ " left join result_info ri on ri.enrollment_no = sd.enrollment_no"
			+ " left join result_status rs on rs.id = ri.result_status_id"
			+ " left join master_marks mm on mm.enrollment_no = sd.enrollment_no and mm.subject_id = ri.subject_id"
			+ " left join reappear_info rpi on rpi.enrollment_no = sd.enrollment_no and rpi.subject_id = ri.subject_id and rpi.subject_distribution_ref_id = mm.subject_distribution_ref_id"
			+ " where si.id = ri.subject_id and rs.status = 'pass' and sd.course_id = ?1"
			+ " group by mm.subject_id"
			+ " order by si.name) innertable"
			+ " group by innertable.semester;", nativeQuery = true)
	public List<Object[]> getClassAvgMarksBySem(String courseId);

	/**
	 * @param univRegNo
	 * @param courseId
	 * @return List of [{distribution type, percentage of marks}]
	 */
	@Query(value = "select sdt.type, (sum(innertable.distribution_marks) / sum(innertable.max_marks)) * 100 as percentage"
			+ " from (select if(rpi.marks is not null, rpi.marks, mm.marks) as distribution_marks, mm.subject_distribution_ref_id, sdri.max_marks"
			+ " from student_detail sd"
			+ " left join course_sub_rel csr on csr.course_id = sd.course_id"
			+ " left join course_info ci on ci.id = sd.course_id"
			+ " left join subject_info si on si.id = csr.subject_id"
			+ " left join result_info ri on ri.enrollment_no = sd.enrollment_no"
			+ " left join result_status rs on rs.id = ri.result_status_id"
			+ " left join master_marks mm on mm.enrollment_no = sd.enrollment_no and mm.subject_id = ri.subject_id"
			+ " left join reappear_info rpi on rpi.enrollment_no = sd.enrollment_no and rpi.subject_id = ri.subject_id and rpi.subject_distribution_ref_id = mm.subject_distribution_ref_id"
			+ " left join subject_distribution_ref_info sdri on sdri.id = rpi.subject_distribution_ref_id or sdri.id = mm.subject_distribution_ref_id"
			+ " where si.id = ri.subject_id and rs.status = 'pass' and sd.university_reg_no = ?1 and sd.course_id = ?2"
			+ " order by si.name) as innertable"
			+ " left join subject_distribution_ref_info sdri on sdri.id = innertable.subject_distribution_ref_id"
			+ " left join subject_distribution_type sdt on sdt.id = sdri.subject_distribution_type_id"
			+ " where sdt.type is not null"
			+ " group by sdt.type;", nativeQuery = true)
	public List<Object[]> getStudentDistributionWisePercentage(String univRegNo, String courseId);

	/**
	 * @param univRegNo
	 * @param courseId
	 * @return List of [{semester, distribution type, marks obtained}]
	 */
	@Query(value = "SELECT sad.result_of_semester, sdt.type, sum(if(rpi.marks is not null, rpi.marks, mm.marks)) as TotalMarks"
			+ " from student_detail sd"
			+ " left join course_sub_rel csr on csr.course_id = sd.course_id "
			+ " left join subject_info si on si.id = csr.subject_id"
			+ " left join subject_distribution_info sdi on sdi.subject_distribution_id = si.subject_distribution_id"
			+ " left join subject_distribution_ref_info sdri on sdri.id = sdi.subject_distribution_ref_id"
			+ " left join subject_distribution_type sdt on sdt.id = sdri.subject_distribution_type_id"
			+ " left join master_marks mm on sdri.id = mm.subject_distribution_ref_id"
			+ " left join reappear_info rpi on rpi.subject_distribution_ref_id = sdri.id"
			+ " left join student_academic_detail sad on sad.enrollment_no = sd.enrollment_no and sad.result_of_semester = csr.semester"
			+ " left join result_status rs on rs.id = sad.result_status_id"
			+ " where sd.university_reg_no = ?1 and sd.course_id = ?2 and rs.status = 'Pass' and sad.result_of_semester >= 1"
			+ " group by sd.enrollment_no, sad.result_of_semester, sdt.type"
			+ " order by sad.result_of_semester, sdt.type", nativeQuery = true)
	public List<Object[]> getStudentSemDistributionTypeMarks(String univRegNo, String courseId);
}
