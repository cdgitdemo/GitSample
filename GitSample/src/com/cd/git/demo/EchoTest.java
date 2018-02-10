package com.cd.git.demo;
/**
 * This class is to demonstrate an echo test.
 */

/**
 * @author Jackson Yang
 *
 */
public class EchoTest {
	
	String name = "Godson";
	/**
	 * 
	 */
	public EchoTest(String name) {
		this.name = name;
	}
	
	public String echo()
	{
		return name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print((new EchoTest("Jianshan(Jackson) Yang")).echo());
		System.out.print((new EchoTest("Zhun(Jack) Yang")).echo());
	}
}
