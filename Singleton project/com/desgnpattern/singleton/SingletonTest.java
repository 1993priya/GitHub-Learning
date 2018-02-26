package com.desgnpattern.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Singleton st=new Singleton();
		//Because we make constructor private in our singleton class so that  
		//object can not be created by any other class
		//Singleton s = new Singleton();
		
		Singleton instance =Singleton.getInstance();
		Singleton instance1 =Singleton.getInstance();
		Singleton instance2 =Singleton.getInstance();

	}
}
	

		

	
