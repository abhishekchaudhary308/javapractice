package dicegame;

public class Dicegame {

    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        
        Player p1 = new Player("Kumar");
        Player p2 = new Player("Arun");
        p1.throwDice(d1, d2);
        p2.throwDice(d1, d2);
        
        if(p1.getValue()>p2.getValue()) {
            System.out.println(p1.getName() + " won the game");
        }
//        else if(p1.getValue() == p2.getValue()) {
//            System.out.println("Scores are equal");
//        }
        else {
            System.out.println(p2.getName() + " won the game");
        }

    }

}