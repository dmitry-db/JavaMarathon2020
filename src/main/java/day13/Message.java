package day13;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;
    private SimpleDateFormat formater = new SimpleDateFormat("MMM dd HH:mm:ss z yyyy");

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
        Date date = new Date();
    }

    @Override
    public String toString() {
        return "FROM: " + sender + "\n" + "TO: " + receiver + "\n" + "ON: " + formater.format(date) + "\n" + text;

    }
}
