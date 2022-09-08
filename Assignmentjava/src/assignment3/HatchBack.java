package assignment3;


public class HatchBack extends Car{
public boolean powerWindowsEnabled;
public boolean automaticGear;
@Override
public double calculateDriveCost(double km) {
	// TODO Auto-generated method stub
	if(automaticGear==true) {
		return km*12;
	}
	return 10;
}
public HatchBack() {
	super();
	// TODO Auto-generated constructor stub
}
public HatchBack(long id, String name, String model, int makeYear, String company, int comfortLevel) {
	super(id, name, model, makeYear, company, comfortLevel);
	// TODO Auto-generated constructor stub
}
public HatchBack(long id, String name, String model, int makeYear, String company, int comfortLevel,
		boolean powerWindowsEnabled, boolean automaticGear) {
	super(id, name, model, makeYear, company, comfortLevel);
	this.powerWindowsEnabled = powerWindowsEnabled;
	this.automaticGear = automaticGear;
}


}

