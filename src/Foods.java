public class Foods extends Consumable{
    protected int Food;
    public Foods(int id, String Color,int Food){
        super(id,Color);
        this.Food=Food;
    }

    public int getFood() {
        return Food;
    }

    public void setFood(int Food) {
        this.Food = Food;
    }
}
