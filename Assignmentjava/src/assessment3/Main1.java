package assessment3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main1 {
public static void main(String[] args) throws NumberFormatException, ParseException {
    Scanner sc=new Scanner(System.in);
    List<Player> player=new ArrayList<Player>();
    for(int i=1;i<=2;i++) {
        System.out.println("Enter Player "+i+" Detail");
        String line=sc.nextLine();
        String[] detail=line.split(",");    
        SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
        Player p=new Player(detail[0],sdf.parse(detail[1]),detail[2],Integer.parseInt(detail[3]),Integer.parseInt(detail[4]),Integer.parseInt(detail[5]),detail[6],Double.parseDouble(detail[7]));
    player.add(p);
    }
    sc.close();
    for(Player e:player) {
        System.out.println(e);
        if(e.equals(player)) {
            System.out.println("player are same");
        }
        else
            System.out.println("Player are not same");
    }
    
    
}
}