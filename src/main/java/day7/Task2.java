package day7;

public class Task2 {
    public static void main(String[] args) {
        int m = (int)(Math.random() * 11 + 90);
        Player player1 = new Player(m);
        Player player2 = new Player(m);
        Player player3 = new Player(m);
        Player player4 = new Player(m);
        Player player5 = new Player(m);
        Player player6 = new Player(m);
        Player.info();
        Player player7 = new Player(m);
        System.out.println(Player.countPlayers);
        for (int i = 0; i < m; i++){
            player1.run();
        }
        System.out.println(player1.getStamina());
        Player.info();

    }
}
