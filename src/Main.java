void main() {

    Player p[] = new Player[6];

    p[0] = new Player("Carlos Alcaraz", "Spain", 22, 1.83f, 74, 0, 0);
    p[1] = new Player("Jannik Sinner", "Italy", 24, 1.91f, 77, 0, 0);
    p[2] = new Player("Alexander Zverev", "Germany", 28, 1.98f, 90, 0, 0);
    p[3] = new Player("Novak Djokovic", "Serbia", 38, 1.88f, 77, 0, 0);
    p[4] = new Player("Taylor Fritz", "USA", 28, 1.96f, 86, 0, 0);
    p[5] = new Player("Stefanos Tsitsipas", "Greece", 27, 1.93f, 90, 0, 0);

    Match firstRound = new Match();
    /* firstRound.matchup(p[0], p[1]);
}