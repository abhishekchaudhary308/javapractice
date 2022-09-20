package assessment5;


import java.util.List;

public class MainQ2 {
public static void main(String[] args) {
		
		StudentReport sreport=new StudentReport();

		List<AverageScore>list=sreport.generateAverageReport("D:\\StudentData.txt");

		for(AverageScore a:list) {
			if(sreport.insert(a)) { // call insert method
				System.out.println("Data Save Successfully");
		}
		
		}
		
	
}
}
