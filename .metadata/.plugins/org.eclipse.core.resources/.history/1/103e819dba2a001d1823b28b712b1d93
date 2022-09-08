package tablebooking;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Customer {
	private long id;
	private String name;
	private String mobileNumber;
	private Date birthdate;
	private double averageSpendAmount;
	private double totalAmount;
	private Date dateEnrolled;
	private double rating;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public double getAverageSpendAmount() {
		return averageSpendAmount;
	}
	public void setAverageSpendAmount(double averageSpendAmount) {
		this.averageSpendAmount = averageSpendAmount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getDateEnrolled() {
		return dateEnrolled;
	}
	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Customer() {
		super();
	}
	public Customer(long id, String name, String mobileNumber, Date birthdate, double averageSpendAmount,
			double totalAmount, Date dateEnrolled, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.birthdate = birthdate;
		this.averageSpendAmount = averageSpendAmount;
		this.totalAmount = totalAmount;
		this.dateEnrolled = dateEnrolled;
		this.rating = rating;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return "Customer [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", birthdate=" + sdf.format(birthdate)
				+ ", averageSpendAmount=" + averageSpendAmount + ", totalAmount=" + totalAmount + ", dateEnrolled="
				+ sdf.format(dateEnrolled) + ", rating=" + rating + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(birthdate, mobileNumber, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(birthdate, other.birthdate) && Objects.equals(mobileNumber, other.mobileNumber)
				&& Objects.equals(name, other.name);
	}
	
}
