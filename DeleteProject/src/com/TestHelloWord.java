package com;


public class TestHelloWord {


	void main()
	{
		System.out.println("In without static method");
	}
	
	void main(int x)
	{
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		new TestHelloWord().main();
		
		TestHelloWord t;
		t=new TestHelloWord();
		
		t.main(10);
		
	}
	

}
