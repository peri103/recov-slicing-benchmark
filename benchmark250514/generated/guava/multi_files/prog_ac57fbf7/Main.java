import com.google.common.collect.MinMaxPriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueueManager queueManager = new PriorityQueueManager();
        Student student = new Student("John");

        // Add grades for the student
        student.addGrade("Math", 85);
        student.addGrade("Science", 90);
        student.addGrade("History", 78);

        // Calculate total grades
        int totalGrades = student.getTotalGrades();
        System.out.println("Total grades: " + totalGrades);

        // Add value to the priority queue
        queueManager.addValue(42);

        // Create another MinMaxPriorityQueue and perform operations
        MinMaxPriorityQueue<Integer> anotherQueue = MinMaxPriorityQueue.create();
        anotherQueue.offer(15);
        anotherQueue.offer(25);
        anotherQueue.offer(35);

        int anotherQueuePeek = anotherQueue.peek();
        System.out.println("Peek value from anotherQueue: " + anotherQueuePeek);

        // Perform more operations
        int maxValue = Math.max(anotherQueuePeek, totalGrades);
        System.out.println("Max value between anotherQueuePeek and totalGrades: " + maxValue);

        // Access the queue from the manager
        MinMaxPriorityQueue<Integer> queue = queueManager.getQueue();
        /* read */ Integer value = queue.peek();
        System.out.println("Peek value from original queue: " + value);

        // Further operations on the original queue
        queue.offer(55);
        queue.offer(65);

        while (!queue.isEmpty()) {
            System.out.println("Polling from queue: " + queue.poll());
        }
    }
}