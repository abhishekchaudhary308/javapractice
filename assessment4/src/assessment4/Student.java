package assessment4;

public class Student {

	private String Studentname;
	private int regNumber;
	private double averageScore;
	private int s1;
	private int s2;
	private int s3;
	private int s4;
	private int s5;
	private int s6;
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public int getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	public int getS3() {
		return s3;
	}
	public void setS3(int s3) {
		this.s3 = s3;
	}
	public int getS4() {
		return s4;
	}
	public void setS4(int s4) {
		this.s4 = s4;
	}
	public int getS5() {
		return s5;
	}
	public void setS5(int s5) {
		this.s5 = s5;
	}
	public int getS6() {
		return s6;
	}
	public void setS6(int s6) {
		this.s6 = s6;
	}
	public Student() {
		super();
	}
	public Student(String studentname, int regNumber, double averageScore, int s1, int s2, int s3, int s4, int s5,
			int s6) {
		super();
		Studentname = studentname;
		this.regNumber = regNumber;
		this.averageScore= (s1+s2+s3+s4+s5+s6)/6;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
	}
	
	
	
}
