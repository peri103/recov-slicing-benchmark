import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.processData(42);

        // Simulating some other operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Adding some more values to the blocking queue
        for (int i = 0; i < 3; i++) {
            student.processData(i * 10);
        }

        // Processing the queue
        LinkedTransferQueue<Integer> queue = student.getQueue();
        /* read */ Integer value = queue.poll();
        System.out.println("Value from LinkedTransferQueue: " + value);

        // Final operation: calculating factorial of 5
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}