package assignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MemberCar {
	private long id;
	private Member member;
	private Car car;
	private String carRegistrationNo;
	private String carColor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getCarRegistrationNo() {
		return carRegistrationNo;
	}

	public void setCarRegistrationNo(String carRegistrationNo) {
		this.carRegistrationNo = carRegistrationNo;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public MemberCar(long id, Member member, Car car, String carRegistrationNo, String carColor) {
		super();
		this.id = id;
		this.member = member;
		this.car = car;
		this.carRegistrationNo = carRegistrationNo;
		this.carColor = carColor;
	}

	@Override
	public String toString() {
		return "MemberCar [id=" + id + ", member=" + member + ", car=" + car + ", carRegistrationNo="
				+ carRegistrationNo + ", carColor=" + carColor + "]";
	}

	

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> member = new ArrayList<Member>();
		ArrayList<Car> cars = new ArrayList<Car>();
		ArrayList<MemberCar> membercar = new ArrayList<>();

		while (true) {

			System.out.println(
					"Menu:\n1:Add a Member\n2:Add a Car\n3:Assign Car to Member(Assume valid date is supplied)\n4:Cars Owned\n5:Exit");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.println("id:");
				int id = sc.nextInt();
				System.out.println("enter the First Name");
				String fName = sc.next();
				
				System.out.println("enter the Last Name");
				String lName = sc.next();

				System.out.println("enter the Email");
				String email = sc.nextLine();
				sc.nextLine();

				System.out.println("enter the Contact No");
				String contact = sc.nextLine();

				System.out.println("enter the LicenseNo");
				String licenseNo = sc.nextLine();

				System.out.println("enter the Start Date");
				String d1 = sc.nextLine();

				System.out.println("enter the end date Date");
				String d2 = sc.nextLine();

				SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");

				Member member1 = new Member(id, fName, lName, email, contact, licenseNo, sdf.parse(d1), sdf.parse(d2));
				member.add(member1);
				System.out.println(member);
			}
			if (choice == 2) {

				System.out.println("id:");
				long cid = sc.nextLong();
				System.out.println("enter the Car Name");
				String cName = sc.nextLine();
				sc.nextLine();
				System.out.println("enter the Car Model");
				String model = sc.nextLine();

				System.out.println("Make year");
				int year = sc.nextInt();
				System.out.println("company");
				String company = sc.nextLine();
				sc.nextLine();
				System.out.println("comfort level");
				int level = sc.nextInt();
				Car c = new UtilityCar(cid, cName, model, year, company, level);
				cars.add(c);
				System.out.println(cars);
			}
			if (choice == 3) {
			
				System.out.println("Member Car id");
				long mId = sc.nextLong();
				System.out.println("membet id");
				long mid = sc.nextLong();
				Member mm = Member.findMember(member, mid);
				System.out.println("Enter the Car Id");
				long cid = sc.nextLong();
				Car c = Car.findCar(cars, cid);
				System.out.println("enter the registration no");
				String regis = sc.nextLine();
				sc.nextLine();
				System.out.println("Color");
				String color = sc.nextLine();
				MemberCar m = new MemberCar(mId, mm, c, regis, color);
				membercar.add(m);
				System.out.println(membercar);

			}
			if(choice==4) {
				System.out.println("Member  id");
				long mId = sc.nextLong();	
				int count=0;
				for(MemberCar mc:membercar) {
					if(mc.getId()==mId) {
					count++;
				
				System.out.println("Registration"+mc.getCarRegistrationNo());
				}
					else
						System.out.println("wrong id");
				}
				System.out.println("Number of cars"+count);
				
			}
			if (choice == 5) {
				System.exit(0);
			}
		}

	}
}