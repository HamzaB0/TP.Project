public class Hunter extends Hero{
    private int NbrFleche;
    Weapons H = new Weapons(1,"Fleche",70);
    Potions P = new Potions(1,"Green",10);
    Foods Fo = new Foods(1,"Red",30);
    Enemy E = new Enemy("Enemy", "Fluffy",60 ,30,1);
    public Hunter(String Type, String Name, int Mana, int NbrFleche){
        super(Type,Name,Mana);
        this.NbrFleche= NbrFleche;
    }
    public int getNbrFleche(){
        return NbrFleche;
    }
    public void setNbrFleche(int NbrFleche){
        this.NbrFleche=NbrFleche;
    }


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
    public void Fight(int HDamage,int EMana,int EDamage,int PPotion, int FoFood){
        Enlvl(EMana,EDamage);
        NbrFleche = 5;
        String F;
        do {
            System.out.println("Presse F to fight");
            F = scanner.nextLine();
            if(F.equals("F")) {
                NbrFleche = NbrFleche - 1;
                if(Mana>100){
                    Mana = 100;}
                if(EMana>100){
                    EMana = 100;
                }
                if (Mana > EMana) {
                    EMana = EMana - HDamage;
                    Mana = Mana -10;
                    if(Mana<0 ) {
                        Mana = 0;
                    }else if(EMana<0){
                        EMana = 0;
                    }
                    System.out.println("successful attack, Enemy Mana: "+EMana);
                    System.out.println("your Hunter's Mana is: "+Mana);
                    System.out.println("Arrows left: "+NbrFleche);
                } else if (Mana < EMana) {
                    Mana = Mana - EDamage;
                    System.out.println("Your Hero took a stroke");
                    System.out.println("your Hunter's Mana is: "+Mana);
                    System.out.println("Arrows left: "+NbrFleche);
                } else {
                    EMana = EMana - HDamage;
                    Mana = Mana -10;
                    System.out.println("successful attack, Enemy Mana: "+EMana);
                    System.out.println("your Hunter's Mana is: "+Mana);
                    System.out.println("Arrows left: "+NbrFleche);
                }
                if(Mana == 0){
                    System.out.println("your Warrior is dead");
                }if(EMana == 0) {
                    System.out.println("your Enemy is dead");
                    HDamage = HDamage + 5;
                    NbrFleche = NbrFleche +1;
                    System.out.println("Bonus for win +Damage, new Damage: "+HDamage);
                    System.out.println("+ one arrow, new arrows number "+NbrFleche);
                }if(Mana<=50 ){
                    System.out.print("Not enough Mana, u can't shoot an arrow");
                    String Mg;
                    System.out.print("Do u want to use a potion or consumable (P/C) ?");
                    Mg = scanner.nextLine();
                    if(Mg.equals("P")){
                        Mana = Mana + PPotion;
                    }else if(Mg.equals("C")){
                        Mana = Mana + FoFood;
                    }
                }
                if (NbrFleche<=0){
                    System.out.println("No more siham");
                }
            }
        } while(Mana>0 && EMana>0);
    }





}
