import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        Random random = new Random();

        // Adding some random numbers to the list
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        // Writing to the student's storage
        student.addScore(42);

        // Performing some operations on the list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, list.get(i) * 2);
            }
        }

        // Reading from the student's storage
        /* read */ boolean hasScore = student.hasScore(42);

        // Printing the results
        System.out.println("Student has score 42: " + hasScore);
        System.out.println("Modified list: " + list);
    }
}