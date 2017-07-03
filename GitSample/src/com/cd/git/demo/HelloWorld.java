package com.cd.git.demo;
/**
 * 
 */

/**
 * @author JYang
 *
 */
public class HelloWorld implements HelloWorldIF {

	/**
	 * 
	 */
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println((new HelloWorld()).hello("JYang @ 09:23"));
	}

	@Override
	public String hello(String name) {
		return "Hello! "+ name;
	}

}
