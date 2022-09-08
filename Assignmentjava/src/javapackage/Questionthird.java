package javapackage;
import java.util.Date;


public class Questionthird {
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String contactnumber;
	private String licensenumber;
	private Date licenceStartDate=new Date();
	private Date licenceExpiryDate = new Date();
	
	// getter for id 
	public long getid() {
	    return id;
	 }

	 // Setter for id
	public void setid(long id) {
	    this.id = id;
	 }
	// getter for firstname
	public String getfirstname() {
	    return firstname;
     }

	 // Setter for firstname
	public void setfirstname(String firstname) {
		 this.firstname = firstname;
	}
	// getter for lastname
	public String getlastname() {
		 return lastname;
	}

	 // Setter for lastname
	public void setlastname(String lastname) {
		 this.lastname = lastname;
	}
	// getter for email
	public String getemail() {
		 return email;
	}

	 // Setter for email
	public void setemail(String email) {
		 this.email = email;
	}
	// getter for contactnumber
	public String getcontactnumber() {
		 return contactnumber;
	}

	 // Setter for contact
	public void setcontactnumber(String contactnumber) {
		 this.contactnumber = contactnumber;
	}
	// getter for licensenumber
	public String getlicensenumber() {
		 return licensenumber;
	}

    // Setter for licensenumber
	public void setlicensenumber(String licensenumber) {
		 this.licensenumber = licensenumber;
	}
	// getter for date
	public Date licenceStartDate() {
		 return licenceStartDate;
	}

	// Setter for licence start date
	public void setlicenceStartDate(Date licenceStartDate) {
		 this.licenceStartDate = licenceStartDate;
	}
	// getter for licence expiry date
	public Date licenceExpiryDate() {
		 return licenceExpiryDate;
	}

	// Setter for licence expiry date
	public void setlicenceExpiryDate(Date licenceExpiryDate) {
		 this.licenceExpiryDate = licenceExpiryDate;
	}
	
	public Questionthird(){
		id=14;
		firstname="abhishek";
		lastname="chaudhary";
		email= "abhishek@gamil.com";
		contactnumber= "98646576486";
		licensenumber= "asddf484987";
		
	}
	public Questionthird(long id,String firstname,String lastname,String email,String contactnumber,String licensenumber){
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email= email;
		this.contactnumber= contactnumber;
		this.licensenumber= licensenumber;
	}
	
	void display() { 
		System.out.println("Member" + firstname + lastname); 
		System.out.println("Member Contact" + email + "," + contactnumber );
	}
	public static void main(String[] args) {
		Questionthird m1 = new Questionthird();
		Questionthird m2 = new Questionthird(45,"abhisehk","pannu","abhishek@gamil.com","adfsasdf","asdfadsf");
		m2.display();
		m1.display();
		
		if(m1.email == m2.email && m1.contactnumber == m2.contactnumber) {
			System.out.println("contact are same");
		}
	}

	
		 
	
	
	
	

}

