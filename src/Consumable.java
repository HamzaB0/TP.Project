public abstract class Consumable extends Item{
    protected String Color;

    public Consumable(){
    }
    public Consumable (int id, String Color){
        super(id);
        this.Color=Color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }
}
