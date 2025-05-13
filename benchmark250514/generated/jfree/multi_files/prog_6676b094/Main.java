import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItemWrapper
        LegendItemWrapper legendItemWrapper = new LegendItemWrapper("Sample Legend");
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        // Set the label font
        legendItemWrapper.setLabelFont(font);

        // Create a course and students
        Course course = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add grades
        alice.addGrade(85);
        alice.addGrade(90);
        bob.addGrade(78);
        bob.addGrade(82);

        // Enroll students in the course
        course.enrollStudent(alice);
        course.enrollStudent(bob);

        // Print student averages
        course.printStudentAverages();

        // Read the label font
        /* read */ Font readFont = legendItemWrapper.getLabelFont();
        System.out.println("Font: " + readFont.getFontName() + ", Style: " + readFont.getStyle() + ", Size: " + readFont.getSize());
    }
}