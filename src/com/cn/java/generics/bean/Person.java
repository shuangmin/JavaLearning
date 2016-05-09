package com.cn.java.generics.bean;

public class Person implements Comparable<Person> {
	private int age;

	public Person() {
	}
	
	public Person(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if (this == o || this.age == o.age) {
			return 0;
		}

		if (this.age < o.age) {
			return -1;
		}
		return 1;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		return this.age == ((Person)obj).age;
	}
	
}
