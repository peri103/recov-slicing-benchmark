import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipHandler gzipHandler = new GzipHandler();
        Course mathCourse = new Course("Mathematics");
        Course scienceCourse = new Course("Science");

        Student alice = new Student("Alice");
        alice.addGrade("Mathematics", 85);
        alice.addGrade("Science", 90);

        Student bob = new Student("Bob");
        bob.addGrade("Mathematics", 78);
        bob.addGrade("Science", 88);

        mathCourse.addStudent(alice);
        mathCourse.addStudent(bob);

        scienceCourse.addStudent(alice);
        scienceCourse.addStudent(bob);

        // Set the gzip ISize
        gzipHandler.setISize(12345);

        // Perform some unrelated operations
        int totalMathScore = 0;
        for (Student student : mathCourse.getStudents()) {
            totalMathScore += student.getGrade("Mathematics");
        }

        System.out.println("Total Mathematics Score: " + totalMathScore);

        int totalScienceScore = 0;
        for (Student student : scienceCourse.getStudents()) {
            totalScienceScore += student.getGrade("Science");
        }

        System.out.println("Total Science Score: " + totalScienceScore);

        // Get the gzip ISize
        /* read */ int iSize = gzipHandler.getISize();
        System.out.println("Gzip ISize: " + iSize);
    }
}