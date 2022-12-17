public class Healer extends SpellCaster{
    Weapons He = new Weapons(1,"N/A",20);
    Potions P = new Potions(1,"Green",80);
    Foods Fo = new Foods(1,"Red",50);
    Enemy E = new Enemy("Enemy", "Enemy",60 ,30,1);
    public Healer(String Type,String Name,int Mana){
        super(Type,Name,Mana);}

    public void Enlvl(int EMana,int EDamage){
        System.out.println("Choose the same lvl for your enemy : ");
        int Level = scanner.nextInt();
        switch (Level){
            case 1 :
                EMana =  60;
                EDamage =  30;
                break;
            case 2 :
                EMana =  65;
                EDamage = 30;
                break;
            case 3 :
                EMana =  70;
                EDamage = 30;
                break;
            case 4 :
                EMana = 75;
                EDamage = 30;
                break;
            case 5 :
                EMana = 80;
                EDamage = 30;
                break;
            default:
                System.out.println("Level doesn't exist");
        }
        if (Level>=6){
            System.out.println("U won !!");
        }
    }
    public void Fight(int HeDamage,int EMana,int EDamage,int PPotion, int FoFood){
        Enlvl(EMana,EDamage);
        do {
            System.out.println("Presse F");
            String F = scanner.nextLine();
            if(F.equals("F")) {
                if(Mana>100){
                    Mana = 100;}
                if(EMana>100){
                    EMana = 100;
                }
                if (Mana > EMana) {
                    EMana = EMana - HeDamage;
                    Mana = Mana -10;
                    if(Mana<0 ) {
                        Mana = 0;
                    }else if(EMana<0){
                        EMana = 0;
                    }
                    System.out.println("successful attack, Enemy Mana: "+EMana);
                    System.out.println("your Hunter's Mana is: "+Mana);
                } else if (Mana < EMana) {
                    Mana = Mana - EDamage;
                    System.out.println("Your Hero took a stroke");
                    System.out.println("your Hunter's Mana is: "+Mana);
                } else {
                    EMana = EMana - HeDamage;
                    Mana = Mana -10;
                    System.out.println("successful attack, Enemy Mana: "+EMana);
                    System.out.println("your Hunter's Mana is: "+Mana);}
            }
            if(Mana == 0){
                System.out.println("your Warrior is dead");
            }if(EMana == 0) {
                System.out.println("your Enemy is dead");
                HeDamage = HeDamage + 5;
                System.out.println("Bonus for win +Damage, new Damage: "+HeDamage);
            }if(Mana<=50 ){
                String Mg;
                System.out.print("Do u want to use a potion or consumable (P/C) ?");
                Mg = scanner.nextLine();
                if(Mg.equals("P")){
                    Mana = Mana + PPotion;
                }else if(Mg.equals("C")){
                    Mana = Mana + FoFood;
                }
            }
        } while(Mana>0 && EMana>0);

    }
}
