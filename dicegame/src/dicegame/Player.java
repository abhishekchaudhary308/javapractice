package dicegame;

public class Player {
    private String name;
    private int value;
    

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    
    public Player(String name) {
        this.name=name;
    }


    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }


    public void throwDice(Dice diceOne,Dice diceTwo) {
        diceOne.getRoll();
        diceTwo.getRoll();
        value = diceOne.getFaceValue() + diceTwo.getFaceValue();
    }
    
    
    
    
    
    public static void main(String[] args) {
        

    }

}
