package com.pgdca.resultmanagement.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pgdca.resultmanagement.jdbc.entity.CourseInfo;

@Repository
public interface CourseInfoJpaRepository extends JpaRepository<CourseInfo, String> {

	/**
	 * @return List of [{count of distinct enrollment no, course name}]
	 */
	@Query("SELECT count(distinct sd.enrollmentNo), ci.courseName from StudentDetail sd Left Join CourseInfo ci on sd.courseId=ci.id where ci.id is not null group by ci.courseName")
	public List<Object[]> getCourseWiseStudentEnrollment();
	
	/**
	 * @return List of [{count of distinct enrollment no, course type, session start year}]
	 */
	@Query("SELECT count(distinct sd.enrollmentNo), ct.type, date_format(sd.sessionStart, '%Y') as year"
			+ " from StudentDetail sd"
			+ " Left Join CourseInfo ci on sd.courseId=ci.id"
			+ " Left Join CourseType ct on ci.courseTypeId = ct.id"
			+ " where ci.id is not null"
			+ " group by sd.sessionStart, ct.type"
			+ " order by sd.sessionStart, ct.type")
	public List<Object[]> getCourseTypeWiseEnrollment();
	
}
