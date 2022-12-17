public class Weapons extends Item{
    protected String Weapon;
    protected int Damage;
    public Weapons(int id, String Weapon, int Damage){
        super(id);
        this.Weapon=Weapon;
        this.Damage=Damage;
    }

    public String getWeapon() {
        return Weapon;
    }
    public void setWeapon(String weapon) {
        this.Weapon = weapon;
    }
    public int getDamage() {
        return Damage;
    }
    public void setDamage(int damage) {
        this.Damage = damage;
    }
}
