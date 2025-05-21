import java.util.Scanner;
public class Project
{
    public static void main(String[] args) 
    {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Game g = new Game();
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("What would you like to play? (Rock = 0, Paper = 1, Scissors = 2)");
        int playerChoice = scanner.nextInt();
        g.play(playerChoice);
    }
}
