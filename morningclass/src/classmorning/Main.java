package classmorning;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
            
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter how many Employees you want to create:  ");
           int size=sc.nextInt();
           Employee[]employees=new Employee[size];
           sc.nextLine();
           for(int i=0;i<employees.length;i++) {
               System.out.println("Enter Next Employees");
               String emps=sc.nextLine();
               String []empDetails=emps.split(",");
               Address address=new Address();
               address.setCity(empDetails[5]);
               address.setState(empDetails[6]);
               address.setCountry(empDetails[7]);
               address.setPincode(empDetails[8]);
               address.setType(empDetails[9]);
               Employee e=new Employee();
               e.setId(Integer.parseInt(empDetails[0]));
               e.setName(empDetails[1]);
               e.setEmail(empDetails[2]);
               e.setSalary(Double.parseDouble(empDetails[3]));
           
               e.setMobile(empDetails[4]);
               e.setAddress(address);
               employees[i]=e;
              
               
            }
           while (true) {
               System.out.println(
                       "Select Option \n 1:Find by email\n 2:Find by mobile\n 3:find least and height salaries employees\n 4:Find Address of Employee");
               int option = sc.nextInt();
               sc.nextLine();

               if (option == 1) {
                   System.out.println("Enter the Email");
                   String email = sc.next();
                   if(EmployeeBO.findEmployeByEmail(employees, email))
                   {
                       System.out.println("employee found with" + email);
                   } else {
                       System.out.println("employee not found with" + email);
                   }

               }
           
               if(option==2) {
                   System.out.println("Enter the Mobile Number");
                   String mobile=sc.next();
                   Employee e1=EmployeeBO.findEmployeByMobile(employees, mobile);
                   System.out.println(e1);
                       
                   
               }
               if(option==3) {
                   Employee[] leastemps=EmployeeBO.findEmployees(employees);
                   for(Employee e:leastemps) {
                       System.out.println(e);
                   }
               }
               if(option==4) {
               System.out.println("Enter the employee id");
               int eid=sc.nextInt();
               Address add=EmployeeBO.findAddress(employees, eid);
               System.out.println(add);
               }
               if(option<1 || option>4) {
                   System.exit(0);
                   sc.close();
               }}
}   
}
