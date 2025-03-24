import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        DataProducer producer = new DataProducer(queue);
        DataProcessor processor = new DataProcessor(queue);
        
        // Create and start the producer thread
        Thread producerThread = new Thread(producer::produceData);
        producerThread.start();
        
        // Create and start the processor thread
        Thread processorThread = new Thread(processor::processData);
        processorThread.start();
        
        // Wait for both threads to finish
        try {
            producerThread.join();
            processorThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main thread finished.");
    }
}