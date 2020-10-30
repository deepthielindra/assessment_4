package com.lab_assignment_4;

import java.io.*;

class Emp implements Serializable {
	
	private int id;
	private String name;
	private String address;
	private transient double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Emp(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public Emp() {

	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + ",salary=" + this.salary + "]";
	}

	public void print() {
		System.out.println("id: " + id + "  name:" + name + "  address:" + address + " Salary:" + salary);
	}

}

public class Employee {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		// serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"));
		Emp emp = new Emp(51894751, "Deepthi", "AP", 25000);
		emp.print();
		oos.writeObject(emp);
		System.out.println(emp);

		System.out.println("object is written");

		// deserialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"));
		System.out.println(emp);

	}
}
