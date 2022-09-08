package assignment3;


public class Sedan extends Car {
public boolean absEnabled;
public int  bootSpace;
public Sedan(long id, String name, String model, int makeYear, String company, int comfortLevel, boolean absEnabled,
		int bootSpace) {
	super(id, name, model, makeYear, company, comfortLevel);
	this.absEnabled = absEnabled;
	this.bootSpace = bootSpace;
}
public Sedan() {
	
}
public Sedan(long id, String name, String model, int makeYear, String company, int comfortLevel) {
	super(id, name, model, makeYear, company, comfortLevel);
}

@Override
public double calculateDriveCost(double km) {
	// TODO Auto-generated method stub
	if(bootSpace>600) {
		
		return (km*15)+km*1/5;
	}
	return 15*km;
}
}


