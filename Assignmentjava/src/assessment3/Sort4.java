package assessment3;
import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sort4 {
	
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
	    
	    System.out.println("\"Select Option \\n 1:sort by number of matches played \\n 2:sort by run scored\\n 3:sort by power rating\\n 4: exit\");");
	    int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
        	Player p1 = new Player();
        	p1.compareTo(player);

        }
    
        if(option==2) {
           
        	Player p1 = new Player();
        	p1.compareTr(player);    
        }
        if(option==3) {
        	
        	Player p1 = new Player();
        	p1.compareTrt(player);
        }
        
        if(option<1 || option>3) {
            System.exit(0);
            sc.close();
        }}
	    
}
