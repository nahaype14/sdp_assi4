// Concrete Product
class PublicChatRoom implements ChatRoomType {
    @Override
    public ChatRoom createChatRoom() {
        return new ConcreteChatRoom();
    }
}
