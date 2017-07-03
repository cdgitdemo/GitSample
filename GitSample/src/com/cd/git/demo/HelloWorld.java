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
		System.console().writer().print((new HelloWorld()).hello("Jianshan Yang @ Change One"));
	}

	@Override
	public String hello(String name) {
		return "Hello! "+ name;
	}

}
