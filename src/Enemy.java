public class Enemy extends Combatent{
    protected int Damage;
    protected int Elvl;
    public Enemy(){
    }
    public Enemy(String Type, String Name, int Mana, int Damage,int Elvl){
        super(Type,Name,Mana);
        this.Damage=Damage;
        this.Elvl=Elvl;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        this.Damage = damage;
    }

    public int getElvl() {
        return Elvl;
    }

    public void setElvl(int elvl) {
        this.Elvl = elvl;
    }




}
