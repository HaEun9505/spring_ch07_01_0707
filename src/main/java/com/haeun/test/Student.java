package com.haeun.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{	//Bean을초기화,취소하는 클래스
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	@Override
	//DisposableBean(파괴) - bean 소멸과정에서 생성
	public void destroy() throws Exception {	
		System.out.println("destroy() 실행됨!!");
		
	}
	@Override
	//InitializingBean(bean의 속성이 셋팅된 후 초기화) - bean 초기화 과정에서 호출
	public void afterPropertiesSet() throws Exception {	
		System.out.println("afterPropertiesSet() 실행됨!!");
	}
}
