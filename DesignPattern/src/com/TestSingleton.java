package com;


import java.io.*;

class MySingleton
{
    static MySingleton instance = null;
    public int x = 10;
   
    // private constructor can't be accessed outside the class
    private MySingleton() {  }
  
    // Factory method to provide the users with instances
    static public MySingleton getInstance()
    {
    //	 if (instance == null)   
    //	 {--
    	//	 synchronized(MySingleton.class){  
                 if (instance == null) 
                 {
                     instance = new MySingleton();
                 }
  
    	//	 }
    	// }-**
    	 return instance;
    }     
} 
public class TestSingleton {

	public static void main(String[] args) {
		 MySingleton a = MySingleton.getInstance();
		 System.out.println(a);
		 System.out.println(a.x);
	       MySingleton b = MySingleton.getInstance();
	       System.out.println(b);
	       System.out.println(b.x);
	       a.x = a.x + 10;
	       System.out.println("Value of a.x = " + a.x);
	       System.out.println("Value of b.x = " + b.x);
	}

}
