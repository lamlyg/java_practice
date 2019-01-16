package com.mulcam.j0116;

public class Person {//JavaBeans(서로 관련있는 속성을 묶어주는 클래스), DTO, VO
	private String name;
	private int age;
	private String job;
	
	public Person() {
		
	}

	public Person(String name, int age, String job) {//오버로딩 생성자
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
	
}
