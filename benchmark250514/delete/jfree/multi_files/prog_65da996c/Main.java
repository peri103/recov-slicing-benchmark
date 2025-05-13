import java.text.NumberFormat;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create NumberFormatManager to manage number formats
        NumberFormatManager formatManager = new NumberFormatManager();

        // Create a NumberFormat instance
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Set the number format using the manager
        formatManager.setFormat(numberFormat);

        // Create a HashMap to store students and their scores
        HashMap<String, Student> studentMap = new HashMap<>();
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(85);
        student1.addScore(90);
        student2.addScore(78);
        student2.addScore(82);

        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);

        // Retrieve and print scores for each student
        for (String studentName : studentMap.keySet()) {
            Student student = studentMap.get(studentName);
            System.out.println("Scores for " + student.getName() + ": " + student.getScores());
        }

        // Retrieve the number format using the manager
        /* read */ NumberFormat retrievedFormat = formatManager.getFormat();

        // Print the retrieved number format to verify it matches the set format
        System.out.println("NumberFormat equals: " + retrievedFormat.equals(numberFormat));
    }
}