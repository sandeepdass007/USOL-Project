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
	 * @return List of [{course name, current semester, subject name}]
	 */
	@Query("select ci.courseName, sd.currentSemester, si.name"
			+ " from SubjectInfo si"
			+ " left join CourseSubRel csr on csr.courseSubSemCompKey.subjectId = si.id"
			+ " left join CourseInfo ci on ci.id = csr.courseSubSemCompKey.courseId"
			+ " left join StudentDetail sd on sd.courseId = csr.courseSubSemCompKey.courseId and sd.currentSemester = csr.courseSubSemCompKey.semester "
			+ " where sd.universityRegNo = ?1 and sd.currentSemester is not null")
	public List<Object[]> getCourseWiseSubjectNames(final String univRegNo);
}
