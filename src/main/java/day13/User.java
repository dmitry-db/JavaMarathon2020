package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    List<User> subscriptions;

    public User(String username){
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        if (subscriptions.contains(user)){
            return true;
        }
        return false;

    }

    public boolean isFriend(User user){
        if (subscriptions.contains(user)){
            if (user.getSubscriptions().contains(this));{
                return true;
            }
        }
        return false;

    }

    public void sendMessage(User user, String text){
        Message message = new Message(this, user, text);
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
