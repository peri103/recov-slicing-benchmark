import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZipArchiveHandler zipHandler = new ZipArchiveHandler("example.txt");
        zipHandler.setCompressionMethod(ZipArchiveEntry.DEFLATED);

        Course course = new Course("Computer Science");
        course.addStudent("Alice");
        course.addStudent("Bob");
        course.assignScore("Alice", 95);
        course.assignScore("Bob", 88);

        ArrayList<String> students = course.getStudents();
        for (String student : students) {
            System.out.println(student + "'s score: " + course.getScore(student));
        }

        /* read */ int method = zipHandler.getCompressionMethod();
        System.out.println("Compression method for example.txt: " + method);
    }
}