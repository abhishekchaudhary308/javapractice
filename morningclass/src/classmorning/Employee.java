package classmorning;

import java.util.Objects;

public class Employee {
    private int id;
    private String name; 
    private String Email; 
    private Address address; 
    private double salary; 
    private String Mobile;
    
    
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
        return Email;
    }


    public void setEmail(String email) {
        Email = email;
    }


    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getMobile() {
        return Mobile;
    }


    public void setMobile(String mobile) {
        Mobile = mobile;
    }


    


    public Employee(int id, String name, String email, Address address, double salary, String mobile) {
        super();
        this.id = id;
        this.name = name;
        Email = email;
        this.address = address;
        this.salary = salary;
        Mobile = mobile;
    }


    public Employee() {
        super();
    }


    @Override
    public int hashCode() {
        return Objects.hash(Email, id);
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
        return Objects.equals(Email, other.Email) && id == other.id;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", Email=" + Email + ", address=" + address + ", salary="
                + salary + ", Mobile=" + Mobile + "]";
    }


    
}