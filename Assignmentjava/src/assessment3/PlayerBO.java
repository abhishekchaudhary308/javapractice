package assessment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class PlayerBO {
    public static Player findPlayer(List<Player> players, String nationality)
    {
    for(Player m:players)
        if(m.getNationality() == nationality)
        {
            
        return m ;
    }
        return null;   
    }
    public static Player findPlayer(List<Player> players, Date dateofBirth)
    {
    for(Player m:players)
        if(m.getDateOfBirth() == dateofBirth)
        {
            
        return m ;
    }
        return null;   
    }
    public static Player findPlayerbyrating(List<Player> players, double powerRating)
    {
    for(Player m:players)
        if(m.getPowerRating() == powerRating)
        {
            
        return m ;
    }
        return null;   
    }
    public static void main(String[] args) throws NumberFormatException, ParseException {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number of player you want to enter");
	    int num = sc.nextInt();
	    List<Player> player=new ArrayList<Player>();
	    for(int i=1;i<=num;i++) {
	        System.out.println("Enter Player "+i+" Detail");
	        String line=sc.nextLine();
	        String[] detail=line.split(",");    
	        SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
	        Player p=new Player(detail[0],sdf.parse(detail[1]),detail[2],Integer.parseInt(detail[3]),Integer.parseInt(detail[4]),Integer.parseInt(detail[5]),detail[6],Double.parseDouble(detail[7]));
	    player.add(p);
	    }
	    sc.close();
	    
	    System.out.println("\"Select Option \\n 1:Find by nationality \\n 2:Find by date of birth\\n 3:find by  power rating\\n 4: exit\");");
	    int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
        	System.out.println("enter the nationaliity");
        	String s1 = sc.nextLine();
        	System.out.println(findPlayer(player, s1));

        }
    
        if(option==2) {
           
        	System.out.println("enter the dateofbirth");
        	String s1 = sc.nextLine();
        	System.out.println(findPlayer(player, s1));  
        }
        if(option==3) {
        	System.out.println("enter the powerrating");
        	double s1 = sc.nextDouble();
        	System.out.println(findPlayerbyrating(player, s1));
        	
        }
        
        if(option<1 || option>3) {
            System.exit(0);
            sc.close();
        }}

}
