public class Main {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();
        MessageProcessor processor = new MessageProcessor(messageQueue);

        // Adding some initial messages
        processor.processMessage("Initial Message 1");
        processor.processMessage("Initial Message 2");

        // Processing the main message
        processor.processMessage("Hello, World!");

        // Retrieving the last message
        /* read */ String lastMessage = processor.retrieveLastMessage();
        System.out.println("Last message: " + lastMessage);

        // Adding more messages
        processor.processMessage("Additional Message 1");
        processor.processMessage("Additional Message 2");

        // Printing all messages
        System.out.println("All messages:");
        System.out.println(lastMessage);
        System.out.println(processor.retrieveLastMessage());
    }
}