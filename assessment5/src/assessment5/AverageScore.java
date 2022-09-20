package assessment5;

public class AverageScore {

	private int reqNumber;
private	String studentName;
	private double averageScore;
	public int getReqNumber() {
		return reqNumber;
	}
	@Override
	public String toString() {
		return "AverageScore [reqNumber=" + reqNumber + ", studentName=" + studentName + ", averageScore="
				+ averageScore + "]";
	}
	public void setReqNumber(int reqNumber) {
		this.reqNumber = reqNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	public AverageScore(int reqNumber, String studentName, double averageScore) {
		super();
		this.reqNumber = reqNumber;
		this.studentName = studentName;
		this.averageScore = averageScore;
	}
	public AverageScore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void calculateAverageScore(double scores[]) {
		double sum=0;
	
		for(int i=0;i<scores.length;i++) {
			 
			 sum=sum+scores[i];
		
	}
		averageScore=sum/6;
}
}
