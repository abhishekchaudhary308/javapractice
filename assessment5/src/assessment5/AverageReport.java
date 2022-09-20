package assessment5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

public class AverageReport extends AverageScore {
	
	public AverageReport() {
		super();
	}
	AverageReport(int req,String name,double avg ){
		super(req,name,avg);
	}
	public List<AverageReport> findMaximumAverageStudents (){
		List<AverageReport> list=new ArrayList<>();
		Connection con=DBConnection.getConn();
	
		try {
			PreparedStatement ps=con.prepareStatement("SELECT * FROM `averagescore` WHERE average_marks=(select max(average_marks) from averagescore)");
		  ResultSet rs= ps.executeQuery();
		  if(rs.next()) {
			  AverageReport ar=new AverageReport(rs.getInt(1),rs.getString(2),rs.getDouble(3));
			   list.add(ar);
		  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
		
	}
	public static void main(String[] args) {
		AverageReport ar=new AverageReport();
		List<AverageReport> list=ar.findMaximumAverageStudents();
		list.stream().forEach(e->System.out.println(e));
}
}
