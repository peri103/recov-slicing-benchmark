import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        
        // Create a DelayedElement with a delay of 1 second
        DelayedElement element = new DelayedElement(1000);
        
        queueManager.addElement(element);
        
        // Additional code to make the program more complex
        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(90);
        student.addScore(95);
        
        System.out.println("Student: " + student.getName());
        System.out.println("Scores: " + student.getScores());
        
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }
        
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }
        
        // More complex operations
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ArrayList elements: " + sum);
        
        linkedList.removeFirst();
        System.out.println("LinkedList after removing first element: " + linkedList);
        
        DelayedElement takenElement = queueManager.takeElement();
        
        System.out.println("Element taken from queue: " + takenElement);
    }
}