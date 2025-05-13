import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a GzipConfig instance and set header CRC
        GzipConfig gzipConfig = new GzipConfig();
        gzipConfig.setHeaderCRC(true);

        // Create a Course and Students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add students to the course
        course.addStudent(student1);
        course.addStudent(student2);

        // Add grades to students
        student1.addGrade(85);
        student1.addGrade(90);
        student2.addGrade(78);
        student2.addGrade(82);

        // Calculate and print average grades
        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + "'s average grade: " + student.calculateAverage());
        }

        // Read the header CRC value
        /* read */ boolean headerCRC = gzipConfig.getHeaderCRC();
        System.out.println("Header CRC: " + headerCRC);
    }
}