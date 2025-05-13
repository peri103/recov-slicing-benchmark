import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a course and adding students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Handling CSV data
        String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.addHeaderComment("This is a comment");
        String comment = csvHandler.parseCSV(csvData);
        System.out.println("CSV Comment: " + comment);
    }
}