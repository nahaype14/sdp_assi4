// Concrete Observer
class ChatUser implements User {
    private String name;

    public ChatUser(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(String message, User sender) {
        System.out.println(name + " received a message from " + sender + ": " + message);
    }
}
