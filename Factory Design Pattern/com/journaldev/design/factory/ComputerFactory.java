package com.journaldev.design.factory;

import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
import com.journaldev.design.model.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("x".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("y".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
	}
	
	public static void main(String [] args) {
		Computer pc = ComputerFactory.getComputer("x", "2gb", "100GB", "1amp");
		System.out.println(pc);
		Computer server = ComputerFactory.getComputer("y", "6gb", "500GB", "6amp");
		System.out.println(server);
	}
}
