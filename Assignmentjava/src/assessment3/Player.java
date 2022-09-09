package assessment3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Player implements Comparable<Player> {

	private String name;
	private Date dateOfBirth;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	public Player(String name, Date dateOfBirth, String skill, int numberOfMatches, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	public Player() {
		super();
	}
	@Override
	public String toString() {
		return "Player [name=" + name + "/n, dateOfBirth=" + dateOfBirth + "/n, skill=" + skill + "/n, numberOfMatches="
				+ numberOfMatches + "/n, runs=" + runs + "/n, wickets=" + wickets + "/n, nationality=" + nationality
				+ "/n, powerRating=" + powerRating + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, nationality, skill);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(name, other.name) && Objects.equals(nationality, other.nationality)
				&& Objects.equals(skill, other.skill);
	}
	
	public int compareTo(List<Player> player) {
		int comparematches
		= ((Player)player).getNumberOfMatches();

	return this.numberOfMatches - comparematches;
	}
	

	public int compareTr(List<Player> player) {
		int comparerun
		= ((Player)player).getRuns();

	return this.runs - comparerun;
	}
	public int compareTrt(List<Player> player) {
		int comparerating
		= (int) ((Player)player).getPowerRating();

	return (int) (this.powerRating - comparerating);
	}
	public static Player createPlayer(String details) throws NumberFormatException, ParseException {
        String[] line=details.split(",");
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        Player p=new Player(line[0],sdf.parse(line[1]),line[2],Integer.parseInt(line[3]),Integer.parseInt(line[4]),Integer.parseInt(line[5]),line[6],Double.parseDouble(line[7]));
        return p;
        
    }
}
