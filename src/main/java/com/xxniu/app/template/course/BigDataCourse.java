package com.xxniu.app.template.course;

public class BigDataCourse extends NetworkCourse {

	@Override
	void checkHomework() {
		System.out.println("检查大数据课程！");
	}

	@Override
	protected boolean needHomework() {
		return true;
	}
	
	
	
}
