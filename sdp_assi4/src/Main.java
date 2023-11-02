public class Main {
    public static void main(String[] args) {
        // Create a chat room factory
        ChatRoomFactory chatRoomFactory = new ChatRoomFactoryImpl();

        // Create a public chat room
        ChatRoomType publicChatRoomType = new PublicChatRoom();
        ChatRoom publicChatRoom = chatRoomFactory.createChatRoom(publicChatRoomType);

        // Create users
        User user1 = new ChatUser("Alice");
        User user2 = new ChatUser("Bob");

        // Add users to the chat room
        publicChatRoom.addObserver(user1);
        publicChatRoom.addObserver(user2);

        // Send a message in the public chat room
        publicChatRoom.sendMessage("Hello, everyone!", user1);
    }
}


