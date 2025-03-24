public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DataProcessor dataProcessor = new DataProcessor();

        // Thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                queueManager.writeValue(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            dataProcessor.processData(i);
        }

        // Thread to perform the read operation
        Thread readerThread = new Thread(() -> {
            try {
                int value = queueManager.readValue();
                dataProcessor.processData(value);
                System.out.println("Processed value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the reader thread
        readerThread.start();

        // Wait for the threads to finish
        writerThread.join();
        readerThread.join();

        // Print the processed data
        System.out.println("Processed data: " + dataProcessor.getProcessedData());
    }
}