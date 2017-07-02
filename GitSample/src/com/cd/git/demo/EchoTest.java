package com.cd.git.demo;
/**
 * 
 */

/**
 * @author JYang
 *
 */
public class EchoTest {
	
	String name = "";
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
		System.out.print((new EchoTest("Jackson")).echo());		
	}

}
