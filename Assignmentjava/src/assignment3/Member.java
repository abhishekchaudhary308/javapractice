package assignment3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Member {

    private long id;
    private String firstName;

    private String lastName;
    private String email;
    private String contactNumber;
    private String licenseNumber;
    private Date licenseStartDate;
    private Date licenseExpiryDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getLicenseStartDate() {
        return licenseStartDate;
    }

    public void setLicenseStartDate(Date licenseStartDate) {
        this.licenseStartDate = licenseStartDate;
    }

    public Date getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public void setLicenseExpiryDate(Date licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }

    public Member() {

    }

    public Member(long id, String firstName, String lastName, String email, String contactNumber, String licenseNumber,
            Date licenseStartDate, Date licenseExpiryDate) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.licenseNumber = licenseNumber;
        this.licenseStartDate = licenseStartDate;
        this.licenseExpiryDate = licenseExpiryDate;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " , " + lastName + "\nMember contact details: " + contactNumber + " , " + email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Member other = (Member) obj;
        if (contactNumber == null) {
            if (other.contactNumber != null)
                return false;
        } else if (!contactNumber.equals(other.contactNumber))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }
    public static Member findMember(List<Member> member,long id) {
        
        for(Member m:member) {
            if(m.getId()==id)
                
                return m;
        }
        return null;
        
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        Member member1 = new Member(1, "Arun", "Kumar", "arun123@gmail.com", "9878767655", "TN38QW1232343",
                sdf.parse("12-12-2010"), sdf.parse("01-11-2020"));
        System.out.println("Member1");
        System.out.println(member1);
        Member member2 = new Member(2, "Mohamed", "Safiq", "safiq1243@gmail.com", "9667826601", "TN33VA1238743",
                sdf.parse("11-12-2010"), sdf.parse("01-11-2022"));
        System.out.println("Member2");
        System.out.println(member2);
        if (member1.equals(member2) == false) {
            System.out.print("Member 1 and Member 2 are different");
        } else
            System.out.print("Member 1 and Member 2 are same");
        
    }
}
