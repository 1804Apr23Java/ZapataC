package com.revature.hello; 

public class Orange extends Fruit{
	
	private String variety;

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public Orange() {
		super(); // calling Fruit's no-args constructor
	}
	
	public Orange(String variety) {
		this(); // implicitly inserted even if we leave it out
		this.variety = variety;
	}
	
	// Overriding: providing a new implementation of an instance method in a superclass
	// Need to have same method signature as superclass' method
	@Override
	public String toString() {
		return "Orange [variety=" + variety + "]";
	}
	
	// code blocks
	{
		// Runs before constructor
		System.out.println("this is an instance code block and will run when this class is instantiated");
	}
	
	// Static:
	static {
		System.out.println("static code block and will run when this class passes through JVM");
	}
	
}
