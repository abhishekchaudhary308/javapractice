package classmorning;

public class EmployeeBO {
    public static Boolean findEmployeByEmail(Employee[] employees,String email) {
        for(Employee emp:employees) {
            if (emp.getEmail().equals(email)) {
                return true;
            }
            
        }
        return false;
    }
    public static Employee findEmployeByMobile(Employee[]employees,String mobile) {
        for(Employee emp:employees) {
            if (emp.getMobile().equals(mobile)) {
                return emp;
            }
            
        }
        return null;
    }
    
    public static Employee[] findEmployees(Employee[] employees) {
        Employee[] emps=new Employee[2];
        double max_salary=Double.MAX_VALUE;
        Employee emp=null;
        for(Employee e:employees) {
            if(e.getSalary()<max_salary) {
                max_salary=e.getSalary();
                emp=e;
            }
        }
        
        double min_salary=Double.MIN_VALUE;
        for(Employee e:employees) {
            if(e.getSalary()<min_salary) {
                min_salary=e.getSalary();
                emp=e;
            }
        }
        
        emps[0]=emp;
        return emps;
    }
    
    public static Address findAddress(Employee[] employees,int empid) {
        for(Employee emp:employees) {
            if (emp.getId()==empid) {
                return emp.getAddress();
            }
        }
        return null;
    
    }
}
