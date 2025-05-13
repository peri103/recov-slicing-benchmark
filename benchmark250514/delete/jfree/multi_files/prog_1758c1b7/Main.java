import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize LegendManager and update the label
        LegendManager legendManager = new LegendManager("Initial Label");
        legendManager.updateLabel("Updated Label");

        // Initialize a Course and add Students
        Course course = new Course("Advanced Java Programming");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Process and print student information
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        // Retrieve and print the updated label
        /* read */ String label = legendManager.retrieveLabel();
        System.out.println("Legend Label: " + label);

        // Additional operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 2);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}