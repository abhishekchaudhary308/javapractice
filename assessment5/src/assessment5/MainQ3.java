package assessment5;


import java.util.List;

public class MainQ3 {
	public static void main(String[] args) {
		AverageReport ar=new AverageReport();
		List<AverageReport> list=ar.findMaximumAverageStudents();
		list.stream().forEach(e->System.out.println(e));
}
}
