package assignment3;

import java.util.List;

abstract class Car {
private long id;
private String name;
private String model;
private int makeYear;
private String Company;
private int comfortLevel;
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
public String getModel() {
    return model;
}
public void setModel(String model) {
    this.model = model;
}
public int getMakeYear() {
    return makeYear;
}
public void setMakeYear(int makeYear) {
    this.makeYear = makeYear;
}
public String getCompany() {
    return Company;
}
public void setCompany(String company) {
    Company = company;
}
public int getComfortLevel() {
    return comfortLevel;
}
public void setComfortLevel(int comfortLevel) {
    this.comfortLevel = comfortLevel;
}
abstract double calculateDriveCost(double km);
public Car(long id, String name, String model, int makeYear, String company, int comfortLevel) {
    super();
    this.id = id;
    this.name = name;
    this.model = model;
    this.makeYear = makeYear;
    Company = company;
    this.comfortLevel = comfortLevel;
}
public Car() {
    super();
}
public static Car findCar(List<Car> cars,long id) {
    for(Car c:cars) {
        if(c.getId()==id)
            return c;
    }
    return null;
    
}
}
