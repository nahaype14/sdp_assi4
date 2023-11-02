// Subject
interface ChatRoom {
    void addObserver(User user);

    void removeObserver(User user);

    void sendMessage(String message, User sender);
}
