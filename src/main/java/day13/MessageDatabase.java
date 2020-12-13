package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> message = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        message.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessage() {
        return message;
    }

    public static void showDialog(User u1, User u2){
        for (Message s : message) {
            if ((s.getSender().equals(u1) && s.getReceiver().equals(u2)) || (s.getSender().equals(u2) && s.getReceiver().equals(u1))) {
                System.out.println(s.getSender() + ": " + s.getText());
            }
        }
    }
}
