package edu.mum.cs.cs525.labs.skeleton;

import java.util.function.Consumer;

public class Application {
	public static void main(String[] args) {
		Hire employee1 = new Employee("Prayash", 200.0);
		Hire employee2 = new Employee("Ramesh", 100.0);
		Hire manager1 = new Manager("Ashmita", 500);
		manager1.add(employee1);
		manager1.add(employee2);
		System.out.println(manager1.getSalary());
		System.out.println(manager1.getSubordinates());
	}

}


