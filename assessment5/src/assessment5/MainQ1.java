package assessment5;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainQ1 {
public static void main(String[] args) {
	
	BufferedReader br=null;
	try {
		br = new BufferedReader(new FileReader(new File("D:\\StudentData.txt")));
	
	AverageScore as=new AverageScore();
	String line=br.readLine();
 while(line!=null) {
	String details[]=line.split(",");
    
	as.setReqNumber(Integer.parseInt(details[0]));
	as.setStudentName(details[1]);
	
	double[] d=new double[6];
	
			d[0]=Double.parseDouble(details[2]);
			d[1]=Double.parseDouble(details[3]);
			d[2]=Double.parseDouble(details[4]);
			d[3]=Double.parseDouble(details[5]);
			d[4]=Double.parseDouble(details[6]);
			d[5]=Double.parseDouble(details[7]);
		    as.calculateAverageScore(d);
		    System.out.println(as);	
			line=br.readLine();
			 
 }

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

}
}

