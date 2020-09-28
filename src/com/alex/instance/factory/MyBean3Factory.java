package com.alex.instance.factory;

public class MyBean3Factory {
	
	//Make sure this factory is instantiated
	public MyBean3Factory() {
		System.out.println("MyBean3Factory instantiated!!");
	}
	
	public Bean3 createBean() {
		return new Bean3();
	}
}
