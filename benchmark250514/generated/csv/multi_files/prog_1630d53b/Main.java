import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name, Age\nJohn, 30\nJane, 25";
        CSVHandler csvHandler = new CSVHandler(csvData);
        
        StudentManager studentManager = new StudentManager();
        studentManager.loadStudents(csvHandler.getRecords());

        List<Student> students = studentManager.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }

        String headerComment = studentManager.getHeaderComment(csvHandler);
        System.out.println("Header Comment: " + headerComment);
    }
}