public class Game
{
    private int c = 0;
    // 0 = rock, 1 = paper, 2 = scissors

    public Game() {
        c = (int)(Math.random() * 3);
    }

    public void play(int p) {
        // p0 c2 || p1 c0 || p2 c0
        boolean pWin = (p == 0 && c == 2) || (p == 1 && c == 0) || (p == 2 && c == 1);
        if (c == p) {
            System.out.println("Tie!!");
        } else if (pWin) { 
            System.out.println("Player Win!!!!!");
        } else { // choice wins
            System.out.println("Computer Win!!");
        }
    }

    public void getC() {
        System.out.print(c);
    }

}