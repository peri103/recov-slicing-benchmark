import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Configure CSV format
        CSVUtils csvUtils = new CSVUtils();
        csvUtils.configureFormat();

        // Create mock data and process it
        String[] data = {"value1", "NULL", "value3"};
        CSVDataProcessor processor = new CSVDataProcessor(Arrays.asList(data), csvUtils);
        boolean isSet = processor.checkIsSet(1);
        System.out.println("Is index 1 set: " + isSet);

        // Create students and courses
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(85);
        student2.addScore(92);

        Course course = new Course("Mathematics");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Scores: " + student.getScores());
        }
    }
}