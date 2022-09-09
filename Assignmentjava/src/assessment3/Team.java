package assessment3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {
    private String name;
    private List<Player> playerList;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Player> getPlayerList() {
        return playerList;
    }
    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
    public Team(String name, List<Player> playerList) {
        super();
        this.name = name;
        this.playerList = playerList;
    }
    public Team() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Team [name=" + name + ", playerList=" + playerList + "]";
    }
    
public void addPlayerToTeam(Player player) {
    playerList=new ArrayList<>();
    playerList.add(player);
    
}
public boolean removePlayerFromTeam(String name) {
    for(Player p:playerList) {
    if(p.getName().equalsIgnoreCase(name)) {
        playerList.remove(p);
        return true;
    }
    }
    return false;
    
}
public void displayPlayer() {
    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name","Date of birth","Skill","No of matches","Runs","Wickets","Nationality","Rating");
    for(Player p:playerList) {
    
    System.out.printf("%-15s%-15s%-10s%-15d%-10d%-10d%-15s%-10f\n",p.getName(),sdf.format(p.getDateOfBirth()),p.getSkill(),p.getNumberOfMatches(),p.getRuns(),p.getWickets(),p.getNationality(),p.getPowerRating());
}
    
}
public static void main(String[] args) throws NumberFormatException, ParseException {
    Scanner sc=new Scanner(System.in);
Team t=new Team();
    while(true) {
        System.out.println(
                "Menu:\n1:Add Player\n2:Delete Player\n3:Display Player\n4:Exit\nEnter your choice");
        
        int choice = sc.nextInt();
    
        
        if (choice == 1) {
            System.out.println("Enter tthe details of player  in CSV format");
            String details=sc.next();
            
            Player p=Player.createPlayer(details);
            t.addPlayerToTeam(p);
            System.out.println("player added Sucessfully");
    }
        if(choice==2) {
            System.out.println("Enter the name");
            String name=sc.next();
        
            if(t.removePlayerFromTeam(name)) {
                System.out.println("player Successfully delete");
            }
            else
                
                System.out.println("player not found in the Team");

            
        }
        if(choice==3) {
    t.displayPlayer();
        }
    }
}
}
