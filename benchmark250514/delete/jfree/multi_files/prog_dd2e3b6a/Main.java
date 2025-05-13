import java.text.NumberFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a NumberFormat object
        NumberFormat format = NumberFormat.getInstance();

        // Create a Course object and set category format
        Course course = new Course("Mathematics");
        course.setCategoryFormat(format);

        // Create a Student object and enroll in the course
        Student student = new Student("John Doe", course);

        // Perform unrelated complex operations
        ArrayList<Integer> grades = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            grades.add(i * 10);
        }

        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        System.out.println("Total Grades: " + total);

        // Read the category format from the course
        NumberFormat readFormat = student.getCourse().getCategoryFormat();
        System.out.println("Read Format: " + readFormat);
    }
}