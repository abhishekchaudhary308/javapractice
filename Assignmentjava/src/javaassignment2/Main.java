package javaassignment2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter How Many employees you want to create");
		int size = sc.nextInt();
		
		
		Employee[] employees= new Employee[size];
		
		sc.nextLine();
		
		for(int i=0; i<employees.length;i++)
		{
		System.out.println("Enter Employee Details");
		
		String employee = sc.nextLine();
		
		String details[] =	employee.split(",");
		
		
		Employee emp = new Employee();
		emp.setId(Integer.parseInt(details[0]));
		emp.setName(details[1]);
		emp.setEmail(details[2]);
		emp.setSalary(Double.parseDouble(details[3]));
		emp.setMobile(details[4]);
		
		
		employees[i] = emp;
		
		}
		
		

	}

}