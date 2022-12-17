import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RPG();
    }

    public static void RPG() {
        Scanner scanner = new Scanner(System.in);
        Hunter H1 = new Hunter("Hero", "Hunter", 100, 5);
        Warrior W1 = new Warrior("Hero", "Warrior", 100);
        Healer He1 = new Healer("Hero", "Healer", 100);
        Mage M1 = new Mage("Hero", "Mage", 100);
        Game G = new Game("Start");
        G.Start();
        System.out.println("Choose a level: from 1 to 5");
        int level = scanner.nextInt();
        do {
            System.out.println("Choose a Hero to fight");
            String Name = scanner.nextLine();
            while (!Name.equals(H1.getName()) && !Name.equals(W1.getName()) && !Name.equals(He1.getName()) && !Name.equals(M1.getName())) {
                System.out.println("Hero doesn't exist");
                System.out.println("Choose a Hero to fight");
                Name = scanner.nextLine();
            }

            if (Name.equals(H1.getName()) || Name.equals(W1.getName()) || Name.equals(He1.getName()) || Name.equals(M1.getName())) {
                System.out.println("You have choosen " + Name);
            }

            if (Name.equals(W1.getName())) {
                W1.Fight(W1.W.getDamage(), W1.E.getMana(), W1.E.getDamage(), W1.P.getPotion(), W1.Fo.getFood());
            }
            if (Name.equals(H1.getName())) {
                H1.Fight(H1.H.getDamage(), H1.E.getMana(), H1.E.getDamage(), H1.P.getPotion(), H1.Fo.getFood());
            }
            if (Name.equals(M1.getName())) {
                M1.Fight(M1.M.getDamage(), M1.E.getMana(), M1.E.getDamage(), M1.P.getPotion(), M1.Fo.getFood());
            }
            if (Name.equals(He1.getName())) {
                He1.Fight(He1.He.getDamage(), He1.E.getMana(), He1.E.getDamage(), He1.P.getPotion(), He1.Fo.getFood());
            }
            if (Name.equals(M1.getName())) {
                M1.Fight(M1.M.getDamage(), M1.E.getMana(), M1.E.getDamage(), M1.P.getPotion(), M1.Fo.getFood());
            }
        }while (level <= 5);
    }
}
