package com.cn.java.generics.bean;

public class MaxValueDemo {
	public static <T extends Comparable<T>> T max(T t0,T t1,T t2)
	{
		T max = t0;
		if(max.compareTo(t1) < 0)
		{
			max = t1;
		}
		
		if(max.compareTo(t2) < 0)
		{
			max = t2;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Person person = new Person(10);
		Person person2 = new Person(11);
		Person person3 = new Person(7);
		System.out.println("max age is " + max(person,person2,person3));
		
		System.out.println("max name is " + max("Hello", "Zero", "World"));
		
		System.out.println("max size is " + max(45, 98, 37));
	}
}
