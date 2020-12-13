package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Vasya");
        User u2 = new User("Semen");
        User u3 = new User("Ivan");

        u1.sendMessage(u2, "Привет");
        u1.sendMessage(u2, "Как дела?");
        u2.sendMessage(u1, "Привет");
        u2.sendMessage(u1, "Хорошо");
        u2.sendMessage(u1, "Как у тебя?");

        u3.sendMessage(u1, "Привет");
        u3.sendMessage(u1, "Как дела");
        u3.sendMessage(u1, "Что нового?");

        u1.sendMessage(u3, "Привет");
        u1.sendMessage(u3, "Хорошо");
        u1.sendMessage(u3, "Все по старому");

        u3.sendMessage(u1, "понятно");

        MessageDatabase.showDialog(u1, u3);

    }
}
