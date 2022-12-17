public class Potions extends Consumable{
    protected int Potion;
    public Potions (int id, String Color,int Potion){
        super(id,Color);
        this.Potion=Potion;
    }

    public int getPotion() {
        return Potion;
    }

    public void setPotion(int potion) {
        this.Potion = potion;
    }

}
