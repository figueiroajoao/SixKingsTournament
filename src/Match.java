import java.util.Objects;
import java.util.Random;

public class Match {
    private Player player1;
    private Player player2;

    public void matchup(Player player1, Player player2) {
        setP1(player1);
        setP2(player2);

        if (!Objects.equals(player1.getCategory(), player2.getCategory())) {
            throw new IllegalArgumentException("Players must be in the same category");
        }
        play();
    }
    public void play() {
        System.out.println("Player 1: " + this.player1.getName());
        System.out.println("VS");
        System.out.println("Player 2: " + this.player2.getName());

        Random random = new Random();
        int winner = random.nextInt(2);
        switch (winner) {
            case 0:
                System.out.println(player1.getName() + " Won!");
                this.player1.winMatch();
                this.player2.loseMatch();
                break;
            case 1:
                System.out.println(player2.getName() + " Won!");
                this.player2.winMatch();
                this.player1.loseMatch();
                break;
        }
    }

    public Player getP1() {
        return player1;
    }

    public void setP1(Player p1) {
        if (p1 != null && p1 == getP2()) {
            throw new IllegalArgumentException("The tennis match must have two different players");
        }
        this.player1 = p1;
    }

    public Player getP2() {
        return player2;
    }

    public void setP2(Player p2) {
        if (p2 != null && p2 == getP1()) {
            throw new IllegalArgumentException("The tennis match must have two different players");
        }
        this.player2 = p2;
    }
}
