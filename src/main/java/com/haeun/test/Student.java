
package com.haeun.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{	//Bean �ʱ�ȭ,���� ��ӹ��� Ŭ����	
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
	//DisposableBean(�ı�) - bean �Ҹ�������� �ڵ� ȣ��
	public void destroy() throws Exception {	
		System.out.println("destroy() �����!!");
		
	}
	@Override
	//InitializingBean - bean�� �Ӽ��� ���õ� �� �ʱ�ȭ(bean �ʱ�ȭ �������� �ڵ� ȣ��)
	public void afterPropertiesSet() throws Exception {	
		System.out.println("afterPropertiesSet() �����!!");
	}
}