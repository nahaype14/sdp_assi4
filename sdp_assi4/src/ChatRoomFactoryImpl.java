// Concrete Factory
class ChatRoomFactoryImpl implements ChatRoomFactory {
    @Override
    public ChatRoom createChatRoom(ChatRoomType type) {
        return type.createChatRoom();
    }
}
