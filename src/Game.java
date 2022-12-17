import java.util.Scanner;

public class Game {
    private String Game;
    public Game(){}
    public Game(String Game){
        this.Game=Game;
    }

    public String getGame() {
        return Game;
    }

    public void setGame(String game) {
        this.Game = game;
    }

    public void Start(){
        Scanner scanner = new Scanner(System.in);
        String P;
        System.out.println("Write GO to start the Game");
        P = scanner.nextLine();
        while(!P.equals("GO")){
            System.out.println("Wrong letter");
            System.out.println("Click S to start the Game");
            P = scanner.nextLine();
        }
        if(P.equals("GO")){
            System.out.println("LET THE BATTLE BEGIN");
            System.out.println("--------------------");
        }
    }
}
