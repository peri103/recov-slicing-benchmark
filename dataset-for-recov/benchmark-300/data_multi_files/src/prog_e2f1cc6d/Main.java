import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor processor = new DataProcessor();
        /* write */ processor.processData(100);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));

        Course mathCourse = new Course("Mathematics", students);
        mathCourse.printStudentGrades();

        /* read */ int data = processor.retrieveData();
        System.out.println("Processed Data: " + data);
    }
}