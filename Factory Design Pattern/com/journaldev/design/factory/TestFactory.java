package com.journaldev.design.factory;

import com.journaldev.design.model.Computer;

public class TestFactory {
public static void main(String [] args) {
	Computer pc = ComputerFactory.getComputer("PC", "2gb", "100GB", "1amp");
	System.out.println(pc);
	Computer server = ComputerFactory.getComputer("server", "6gb", "500GB", "6amp");
	System.out.println(server);
}
}
