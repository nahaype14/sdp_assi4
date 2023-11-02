class PrivateChatRoom implements ChatRoomType {
    @Override
    public ChatRoom createChatRoom() {
        return new ConcreteChatRoom();
    }
}
