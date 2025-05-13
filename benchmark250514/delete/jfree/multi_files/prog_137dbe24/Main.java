import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a label generator and set a format string
        LabelGeneratorWrapper labelGeneratorWrapper = new LabelGeneratorWrapper();
        labelGeneratorWrapper.setFormatString("{0}: {1}");

        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(85);
        student2.addScore(90);

        course.addStudent(student1);
        course.addStudent(student2);

        // Print student scores
        for (Student student : course.getStudents()) {
            System.out.println("Scores for " + student.getScores());
        }

        // Perform some unrelated calculations
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total += i;
        }
        System.out.println("Total sum: " + total);

        // Read the format string from the label generator
        /* read */ String formatString = labelGeneratorWrapper.getFormatString();
        System.out.println("Format string: " + formatString);
    }
}