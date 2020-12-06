package day7;

public class Player {
    private int stamina;
    private int st = 0;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina){
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run(){
        if (stamina > 0) {
            stamina--;
        }
        if (stamina == 0 && st == 0){
            countPlayers--;
            st++;
        }
    }

    public static void info(){
        String s = "";
        switch (6 - countPlayers){
            case 1:
                s = "одно";
                break;
            case 2:
                s = "два";
                break;
            case 3:
                s = "три";
                break;
            case 4:
                s = "четыре";
                break;
            case 5:
                s = "пять";
                break;
            case 6:
                s = "шесть";
                break;
        }
        if (countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть " + s + " свободных мест");
        }
        else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
