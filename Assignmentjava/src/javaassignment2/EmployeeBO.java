package javaassignment2;

public class EmployeeBO {

	public static Boolean FindEmployeeByEmail(Employee[] employees, String Email) {
		String email= Email;
		for(int i=0; i<employees.length; i++) {
			if(employees[i].getEmail()== email) {
				return true;
			}
		}
		return false;
     }
}

