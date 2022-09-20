package assessment4;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AverageScore {

	String filepath = "D:\\student.txt";
	public static  List<Student> loadEmployees(String filepath)
	{
		
		List<Student> StudentList = new ArrayList<Student>();
		
	BufferedReader br= null;
	
	try
	{
		br = new BufferedReader(new FileReader(new File(filepath)));
	
	
	     String line = br.readLine();
	     
	     while(line!=null)
	     {
	 String[] data =   	line.split(","); 
	 
	 
	 Student stu = new Student(data[0],  Integer.parseInt(data[1]), Double.parseDouble(data[1]), Integer.parseInt(data[2]),Integer.parseInt(data[3]), Integer.parseInt(data[4]),Integer.parseInt(data[5]),Integer.parseInt(data[6]),Integer.parseInt(data[7]));
	 StudentList.add(stu);
	 line = br.readLine();
	 
	     }
	
	
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		return StudentList;
	}
	
}
