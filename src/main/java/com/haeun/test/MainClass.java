package com.haeun.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//AbstractApplicationContext ctx = new GenericXmlApplicationContext();	//��ĳ����
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();	// AbstractApplicationContext ���� ���� Ŭ����
		
		ctx.load("classpath:applicationCTX.xml");
		
		//��ε�
		ctx.refresh();
		
		Student student = ctx.getBean("student", Student.class);
		System.out.println(student.getName());	//ȫ�浿 ���
		
		ctx.close();
	}

}
