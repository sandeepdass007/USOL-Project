package com.pgdca.resultmanagement.chartservice.jpa;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pgdca.resultmanagement.chartservice.dao.DistributionTypePercentageDao;
import com.pgdca.resultmanagement.chartservice.dao.SemDistributionTypeMarksDao;
import com.pgdca.resultmanagement.chartservice.dao.SemMarksDao;
import com.pgdca.resultmanagement.chartservice.dao.SubjectMarksDao;
import com.pgdca.resultmanagement.chartservice.dao.YearCourseWiseEnrollmentDao;

@Component
public class JpaRepository {

	@Autowired
	private StudentAcademicJpaRepository studentAcademicJpaRepository;

	@Autowired
	private CourseInfoJpaRepository courseInfoJpaRepository;

	public HashMap<String, Long> getCourseWiseStudentEnrollment() {
		HashMap<String, Long> map = new HashMap<String, Long>();
		final List<Object[]> courseWiseStudentEnrollment = courseInfoJpaRepository.getCourseWiseStudentEnrollment();
		for (Object[] entry : courseWiseStudentEnrollment) {
			Long count = (Long) entry[0];
			String courseName = (String) entry[1];
			map.put(courseName, count);
		}
		return map;
	}

	public List<YearCourseWiseEnrollmentDao> getCourseTypeWiseEnrollment() {
		List<YearCourseWiseEnrollmentDao> list = new LinkedList<YearCourseWiseEnrollmentDao>();
		final List<Object[]> courseTypeWiseEnrollment = courseInfoJpaRepository.getCourseTypeWiseEnrollment();

		for (Object[] entry : courseTypeWiseEnrollment) {
			Long count = (Long) entry[0];
			String courseType = (String) entry[1];
			Integer year = Integer.parseInt((String) entry[2]);
			list.add(new YearCourseWiseEnrollmentDao(count, courseType, year));
		}
		return list;
	}

	public List<Object[]> getCourseWiseSubjectNames(String username) {
		final List<Object[]> courseWiseSubjectNames = studentAcademicJpaRepository.getCourseWiseSubjectNames(username);
		return courseWiseSubjectNames;
	}

	public HashMap<Integer, List<SubjectMarksDao>> getStudentSemSubMarks(String univRegNo, String courseId) {
		final List<Object[]> studentSemSubMarks = studentAcademicJpaRepository.getStudentSemSubMarks(univRegNo,
				courseId);
		HashMap<Integer, List<SubjectMarksDao>> map = new HashMap<Integer, List<SubjectMarksDao>>();
		for (Object[] entry : studentSemSubMarks) {
			Integer semester = (Integer) entry[0];
			String subjectName = (String) entry[1];
			Integer marks = ((BigDecimal) entry[2]).intValue();
			map.compute(semester, (sem, val) -> {
				if (val == null) {
					val = new LinkedList<SubjectMarksDao>();
				}
				val.add(new SubjectMarksDao(subjectName, marks));
				return val;
			});
		}
		return map;
	}

	public List<SemMarksDao> getStudentAvgMarksBySem(String univRegNo, String courseId) {
		final List<Object[]> studentAvgMarksBySem = studentAcademicJpaRepository.getStudentAvgMarksBySem(univRegNo,
				courseId);
		List<SemMarksDao> avgMarksBySem = new LinkedList<SemMarksDao>();
		for (Object[] entry : studentAvgMarksBySem) {
			Float avgMarks = ((BigDecimal) entry[0]).floatValue();
			Integer semester = ((Integer) entry[1]);
			avgMarksBySem.add(new SemMarksDao(semester, avgMarks));
		}
		return avgMarksBySem;
	}

	public List<SemMarksDao> getClassAvgMarksBySem(String courseId) {
		final List<Object[]> studentAvgMarksBySem = studentAcademicJpaRepository.getClassAvgMarksBySem(courseId);
		List<SemMarksDao> classAvgMarksBySem = new LinkedList<SemMarksDao>();
		for (Object[] entry : studentAvgMarksBySem) {
			Float avgMarks = ((BigDecimal) entry[0]).floatValue();
			Integer semester = (Integer) entry[1];
			classAvgMarksBySem.add(new SemMarksDao(semester, avgMarks));
		}
		return classAvgMarksBySem;
	}

	public List<DistributionTypePercentageDao> getStudentDistributionWisePercentage(String univRegNo, String courseId) {
		final List<Object[]> studentDistributionWisePercentage = studentAcademicJpaRepository
				.getStudentDistributionWisePercentage(univRegNo, courseId);
		List<DistributionTypePercentageDao> list = new LinkedList<DistributionTypePercentageDao>();
		for (Object[] entry : studentDistributionWisePercentage) {
			String type = (String) entry[0];
			Float percentage = ((BigDecimal) entry[1]).floatValue();
			list.add(new DistributionTypePercentageDao(type, percentage));
		}
		return list;
	}

	public List<SemDistributionTypeMarksDao> getStudentSemDistributionTypeMarks(String univRegNo, String courseId) {
		final List<Object[]> studentSemDistributionTypeMarks = studentAcademicJpaRepository
				.getStudentSemDistributionTypeMarks(univRegNo, courseId);
		List<SemDistributionTypeMarksDao> list = new LinkedList<SemDistributionTypeMarksDao>();
		for (Object[] entry : studentSemDistributionTypeMarks) {
			Integer semester = (Integer) entry[0];
			String type = (String) entry[1];
			Integer marks = ((BigDecimal) entry[2]).intValue();
			list.add(new SemDistributionTypeMarksDao(type, marks, semester));
		}
		return list;
	}
}
