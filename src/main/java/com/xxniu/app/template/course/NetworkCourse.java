package com.xxniu.app.template.course;

public abstract class NetworkCourse {
	public final void createCourse() {
		// 1、发布预习资料
		this.postPreResource();
		// 2、制作 PPT 课件
		this.createPPT();
		// 3、在线直播
		this.liveVideo();
		// 4、提交课件、课堂笔记
		this.postNote();
		// 5、提交源码
		this.postSource();
		// 6、布置作业，有些课是没有作业，有些课是有作业的 //如果有作业的话，检查作业，如果没作业，完成了
		if (needHomework()) {
			checkHomework();
		}

	}

	abstract void checkHomework();

	protected boolean needHomework() {
		return false;
	}

	private final void postSource() {
		System.out.println("提交源码");
	}

	private final void postNote() {
		System.out.println("提交课件、课堂笔记");
	}

	private final void liveVideo() {
		System.out.println("在线直播");
	}

	private final void createPPT() {
		System.out.println("制作PPT课件");
	}

	private final void postPreResource() {
		System.out.println("发布预习资料!");
	}
}
