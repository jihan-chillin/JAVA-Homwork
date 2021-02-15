package com.kh.silsub2.person.model.vo;

public class Person {
	
	private int age;
	private int height;
	private int weight;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int age, int height, int weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public void printInfo() {
		System.out.println("나이 : "+ age+"\t 키 : "+height +"\t 몸무게 : "+weight);
	}
	
}
