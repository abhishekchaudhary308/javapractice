package assignment3;


public class UtilityCar extends Car {
	public boolean rearCoolingVents;

	public UtilityCar(long id, String name, String model, int makeYear, String company, int comfortLevel,
			boolean rearCoolingVents) {
		super(id, name, model, makeYear, company, comfortLevel);
		this.rearCoolingVents = rearCoolingVents;
	}

	public UtilityCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UtilityCar(long id, String name, String model, int makeYear, String company, int comfortLevel) {
		super(id, name, model, makeYear, company, comfortLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateDriveCost(double km) {
		// TODO Auto-generated method stub
		
		return 18*km;
	}
	

}

