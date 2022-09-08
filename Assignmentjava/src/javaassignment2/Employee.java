package javaassignment2;

import java.util.Objects;

public class Employee {
	private int id;
	private String name; 
	private String email;
	private String Mobile;
	private Double Salary ;
	private Address address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", Mobile=" + Mobile + ", Salary="
				+ Salary + ", address=" + address + "]";
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee() {
	}
	public Employee(int id, String name, String email, String mobile, Double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		Mobile = mobile;
		Salary = salary;
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Mobile, Salary, address, email, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Mobile, other.Mobile) && Objects.equals(Salary, other.Salary)
				&& Objects.equals(address, other.address) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name);
	}

	
	
}
