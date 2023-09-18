package com.springcore.ci;

public class AmbiTest {
	
	private int a;
	private int b;
	
	public AmbiTest(double a, double b) {
		this.a=(int)a;
		this.b=(int)b;
	}
	
	public AmbiTest(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public AmbiTest(String a, String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("String,String");
	}
	
	
     @Override
	public String toString() {
		return "Addition of a + b = " + (a+b);
	}
	
	/*public void show() {
		System.out.println("The addition of a and b : "+());
	}*/
}
