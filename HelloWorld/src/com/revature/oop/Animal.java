package com.revature.oop;

public abstract class Animal {

	public static String latinName = "animalis";

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	public Animal(String name) {
		this(); // no super needed because it is implicit
		this.name = name;
	}

	public Animal() {
		super();
	}

	// abstract method
	abstract String makeNoise();

}
