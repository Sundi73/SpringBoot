package Basics;

public class Employee {
	
	private String name;
//	private int age;
//	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	

}
