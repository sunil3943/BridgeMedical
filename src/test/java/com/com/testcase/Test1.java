package com.com.testcase;

public class Test1 {
	
	Test1(){
		
		System.out.println("Test1");
	}
	
	

}

class Test extends Test1{
	
	Test(){
		
		System.out.println("Test");
	}
	
	


static{
	
	System.out.println("testing");
}

public static void main(String[] args){
	
	System.out.println("a");
	Test test = new Test();
}
}


