import java.util.Scanner;

public abstract class Combatent extends Game {
    Scanner scanner = new Scanner(System.in);
    protected String Type ;
    protected String Name;
    protected int Mana;


    public Combatent(){
    }

    public Combatent(String Type, String Name,int Mana){
        this.Type=Type;
        this.Name=Name;
        this.Mana=Mana;
    }
    public String getType(){
        return Type;
    }
    public void setType(String Type){
        this.Type=Type;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getMana(){
        return Mana;
    }
    public void setMana(int Mana){
        this.Mana=Mana;
    }

}
