package oop;

public class Machine {
	private String name;
	private int code;
	
	public Machine() {
		System.out.println("Constructor running.");
	}
	public Machine(String name) {
		System.out.println("Constructor running : " + name);
	}
	public Machine(String name,int code) {
		System.out.println("Constructor 3rd running.");
		this.name = name;
		this.code = code;
	}
}
