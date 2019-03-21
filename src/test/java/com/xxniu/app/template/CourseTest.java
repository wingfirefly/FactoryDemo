package com.xxniu.app.template;

import com.xxniu.app.template.course.BigDataCourse;
import com.xxniu.app.template.course.JavaCourse;
import com.xxniu.app.template.course.NetworkCourse;

public class CourseTest {
	public static void main(String[] args) {
		NetworkCourse javaCourse = new JavaCourse();
		javaCourse.createCourse();
		NetworkCourse bigDataCourse = new BigDataCourse();
		bigDataCourse.createCourse();
	}
}
