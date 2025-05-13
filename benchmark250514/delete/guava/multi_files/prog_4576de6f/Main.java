import java.util.TreeSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student = new Student("John Doe", mathCourse);

        mathCourse.addScore(95);

        Set<String> topics = new TreeSet<>();
        topics.add("Algebra");
        topics.add("Calculus");
        topics.add("Geometry");

        for (String topic : topics) {
            System.out.println("Math Topic: " + topic);
        }

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * 10;
        }
        System.out.println("Sum of multiples of 10 up to 50: " + sum);

        if (sum > 100) {
            System.out.println("Sum is greater than 100");
        } else {
            System.out.println("Sum is less than or equal to 100");
        }

        /* read */ boolean hasScore = student.getCourse().hasScore(95);
        System.out.println("Student has score 95: " + hasScore);

        Set<Double> grades = new HashSet<>();
        for (double g = 1.0; g <= 4.0; g += 0.5) {
            grades.add(g);
        }

        for (Double grade : grades) {
            System.out.println("Grade: " + grade);
        }
    }
}