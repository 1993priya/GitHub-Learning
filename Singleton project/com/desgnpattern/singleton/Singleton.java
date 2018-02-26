package com.desgnpattern.singleton;

public class Singleton {
	
	// create single class which is responsible to object 
	
	private static Singleton instance  ;
	
			// make the constructor private so that this class cannot be instantiated 
			//with any other way 
			private Singleton()
			{
				
			}
			// to get the object available
			
			public  static Singleton getInstance() {
				if(instance == null){
					System.out.println("first initilization");
					instance = new Singleton();
				}
			
				System.out.println(instance);
				System.out.println("hi ");
				return instance;
			}
			
			public String toString(){
				
				return "instance created";
			}

}
