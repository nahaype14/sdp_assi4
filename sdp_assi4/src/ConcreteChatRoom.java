import java.util.ArrayList;
import java.util.List;

// Concrete Subject
class ConcreteChatRoom implements ChatRoom {
    private List<User> users = new ArrayList<>();

    @Override
    public void addObserver(User user) {
        users.add(user);
    }

    @Override
    public void removeObserver(User user) {
        users.remove(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            user.receiveMessage(message, sender);
        }
    }
}
