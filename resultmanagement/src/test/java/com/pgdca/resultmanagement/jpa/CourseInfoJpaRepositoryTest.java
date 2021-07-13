package com.pgdca.resultmanagement.jpa;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.pgdca.resultmanagement.jdbc.entity.CourseInfo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CourseInfoJpaRepositoryTest {

	@Autowired
	private CourseInfoJpaRepository courseInfoJpaRepository;
	
	@Test
	public void test_getCourseWiseStudentEnrollment() {
		final List<Object[]> courseWiseStudentEnrollment = courseInfoJpaRepository.getCourseWiseStudentEnrollment();
		assertThat(courseWiseStudentEnrollment).isNotNull().isNotEmpty();
		final Object[] actual = courseWiseStudentEnrollment.stream().findAny().get();
		final Long count = (Long)actual[0];
		final String courseName = (String)actual[1];
		assertThat(count).isNotNull().isNotNegative();
		assertThat(courseName).isNotBlank();
	}
	
	@Test
	public void test_getCourseTypeWiseEnrollment() {
		final List<Object[]> courseTypeWiseEnrollment = courseInfoJpaRepository.getCourseTypeWiseEnrollment();
		assertThat(courseTypeWiseEnrollment).isNotNull().isNotEmpty();
		final Object[] actual = courseTypeWiseEnrollment.stream().findAny().get();
		Long count = (Long)actual[0];
		String courseType = (String)actual[1];
		Integer year = Integer.parseInt((String)actual[2]);
		assertThat(count).isNotNull().isNotNegative();
		assertThat(courseType).isNotBlank();
		assertThat(year).isNotNull().isNotNegative();
	}
	
	@Test
	public void test_repositoryMethods() {
		final List<CourseInfo> allCourseInfos = courseInfoJpaRepository.findAll();
		assertThat(allCourseInfos).isNotNull().isNotEmpty();
		assertThat(courseInfoJpaRepository.count()).isNotNull().isNotNegative();
	}
	
}
