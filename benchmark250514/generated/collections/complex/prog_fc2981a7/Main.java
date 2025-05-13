import org.apache.commons.collections4.queue.CircularFifoQueue;

public class Main {
    public static void main(String[] args) {
        // Initialize the CircularFifoQueue with a capacity of 5
        CircularFifoQueue<Integer> queue = new CircularFifoQueue<>(5);
        CircularFifoQueue<Integer> secondaryQueue = new CircularFifoQueue<>(3);

        /* write */ queue.add(42);

        // Add more elements to the secondaryQueue
        secondaryQueue.add(100);
        secondaryQueue.add(200);
        secondaryQueue.add(300);

        // Perform some operations on the secondaryQueue
        int secondaryValue = secondaryQueue.peek();
        secondaryQueue.add(secondaryValue + 50);
        secondaryQueue.poll();

        // Perform operations on the original queue
        queue.add(50);
        queue.add(60);
        queue.add(70);

        // Iterate through the elements in the queue
        for (Integer element : queue) {
            System.out.println("Queue element: " + element);
        }

        // Perform some additional calculations
        int sum = 0;
        for (Integer element : secondaryQueue) {
            sum += element;
        }
        System.out.println("Sum of secondary queue elements: " + sum);

        /* read */ int value = queue.peek();
        System.out.println(value);

        // Add more elements to the queue after reading
        queue.add(80);
        queue.add(90);

        // Print all elements of the queue
        for (Integer element : queue) {
            System.out.println("Final queue element: " + element);
        }
    }
}