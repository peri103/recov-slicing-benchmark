public class Main {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();
        MessageProcessor processor = new MessageProcessor(messageQueue);

        // Adding a message to the queue
        messageQueue.addMessage("Hello, World!");

        // Processing the message
        processor.processMessage();
    }
}