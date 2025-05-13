import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Create a CustomLabelGenerator instance
        CustomLabelGenerator customLabelGenerator = new CustomLabelGenerator();
        
        // Create a NumberFormat instance and set it using the CustomLabelGenerator
        NumberFormat numberFormat = NumberFormat.getInstance();
        customLabelGenerator.setCustomNumberFormat(numberFormat);
        
        // Create a Course and some Students
        Course course = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        
        // Enroll students in the course
        course.enrollStudent(alice);
        course.enrollStudent(bob);
        
        // Add scores for the students
        alice.addScore(85);
        bob.addScore(90);
        
        // Retrieve the number format from CustomLabelGenerator
        /* read */ NumberFormat retrievedFormat = customLabelGenerator.retrieveNumberFormat();
        
        // Print out the result to verify the operation
        System.out.println("Retrieved format equals original: " + retrievedFormat.equals(numberFormat)); // Should print true
        
        // Display student scores
        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + "'s scores: " + student.getScores());
        }
    }
}