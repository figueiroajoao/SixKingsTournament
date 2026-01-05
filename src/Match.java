public class Match {
    private Player p1;
    private Player p2;

    public Match(Player p1, Player p2) {
        this.setP1(p1);
        this.setP2(p2);
        int sets = 3;
    }

    public void matchup() {

    }
    public void play() {

    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        if (p1.equals(getP2())) {
            throw new IllegalArgumentException("The tennis match must have two different players");
        }
        this.p1 = p1;
    }

    public Player getP2() {
        return p2;
    }

    public void setP2(Player p2) {
        if (p2.equals(getP1())) {
            throw new IllegalArgumentException("The tennis match must have two different players");
        }
        this.p2 = p2;
    }
}
