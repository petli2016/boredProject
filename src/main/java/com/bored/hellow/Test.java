package com.bored.hellow;

public class Test
{
	private final int v1 = getV1();
	private static int c1 = 0;
	private static int getV1(){
		c1 ++;
		return 1+c1;
	}
	public static void main(String[] args)
	{
		System.out.println(new Test().v1);
		System.out.println(new Test().v1);
	}
}
