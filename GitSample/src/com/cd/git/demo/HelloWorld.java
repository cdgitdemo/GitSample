package com.cd.git.demo;
/**
 * 
 */

/**
 * @author JYang
 *
 */
public class HelloWorld implements HelloWorldIF {
	String name = "";

	/**
	 * 
	 */
	public HelloWorld() {
		this.name = "NoName";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println((new HelloWorld()).hello("Jianshan Yang"));
		System.out.println((new HelloWorld()).hello("Jackson Yang"));
		System.out.println((new HelloWorld()).hello("Jack Yang"));
	}

	@Override
	public String hello(String name) {
		return "Hello! "+ name;
	}

}
