public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DataProcessor dataProcessor = new DataProcessor();

        // Adding initial data
        for (int i = 0; i < 5; i++) {
            dataProcessor.addToList(i * 10);
            dataProcessor.addToLinkedList(i * 20);
        }

        // Writer thread
        Thread writer = new Thread(() -> {
            try {
                queueManager.writeValue(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Reader thread
        Thread reader = new Thread(() -> {
            try {
                int value = queueManager.readValue();
                System.out.println("Value from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        writer.start();
        reader.start();

        // Process initial data
        dataProcessor.processData();

        writer.join();
        reader.join();

        // Add more data
        dataProcessor.addToList(100);
        dataProcessor.addToLinkedList(200);

        // Process updated data
        dataProcessor.processData();
    }
}