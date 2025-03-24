import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        Student student = new Student("Alice");

        // Generate scores for the student
        student.generateScores();

        // Print the student's scores
        System.out.println(student.getName() + "'s scores: " + student.getScores());

        // Add data to the DataStore
        dataStore.addData("Hello");

        // Perform some operations on the student's scores
        int sum = 0;
        for (Integer score : student.getScores()) {
            sum += score;
        }
        System.out.println("Sum of " + student.getName() + "'s scores: " + sum);

        // Check if the DataStore contains the data "Hello"
        /* read */ boolean contains = dataStore.containsData("Hello");
        System.out.println("DataStore contains 'Hello': " + contains);

        // Add more data to the DataStore
        dataStore.addData("World");
        dataStore.addData("Java");

        // Print the DataStore
        System.out.println("DataStore: " + dataStore.containsData("World"));
    }
}