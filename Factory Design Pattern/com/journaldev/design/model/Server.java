package com.journaldev.design.model;

//import com.journaldev.design.factory.ComputerFactory;

public class Server extends Computer {

	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	
		@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}
/*public class Server2 extends Server
{

	public Server2(String ram, String hdd, String cpu) {
		super(ram, hdd, cpu);
		// TODO Auto-generated constructor stub
	}
	}
*/