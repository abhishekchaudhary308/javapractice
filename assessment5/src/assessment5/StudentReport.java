package assessment5;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentReport {
	public List<AverageScore> generateAverageReport(String filePath) {
		List<AverageScore> list = new ArrayList<AverageScore>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File(filePath)));

			
			String line = br.readLine();
			while (line != null) {
				AverageScore as = new AverageScore();
				String details[] = line.split(",");
				if (validate(details[0])) {

					as.setReqNumber(Integer.parseInt(details[0]));
					as.setStudentName(details[1]);

					double[] d = new double[6];

					d[0] = Double.parseDouble(details[2]);
					d[1] = Double.parseDouble(details[3]);
					d[2] = Double.parseDouble(details[4]);
					d[3] = Double.parseDouble(details[5]);
					d[4] = Double.parseDouble(details[6]);
					d[5] = Double.parseDouble(details[7]);
					as.calculateAverageScore(d);
					list.add(as);
					line = br.readLine();

				} else {
					throw new InvalidRegNumberException("Invalid Registration number");
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidRegNumberException e) {
			// TODO Auto-generated catch block

		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;

	}

	boolean validate(String regNumber) {

		if (regNumber.length() == 5) {
			for (int i = 0; i < regNumber.length(); i++) {
				if (Character.isDigit(regNumber.charAt(i))) {
					return true;
				}
			}
		}
		return false;

	}
	public boolean insert(AverageScore as) {
	
	
		Connection con=DBConnection.getConn();
		try {
		
			PreparedStatement ps=con.prepareStatement("insert into averagescore values(?,?,?)");
			
			ps.setInt(1, as.getReqNumber());
			ps.setString(2, as.getStudentName());
			ps.setDouble(3, as.getAverageScore());
			
			int i=ps.executeUpdate();
			if(i>=1)return true;
			}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		return false;
		
	}

}

