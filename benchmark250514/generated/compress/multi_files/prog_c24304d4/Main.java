import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipEntryManager manager = new ZipEntryManager();
        manager.addEntry("example.txt", 1024);

        Student student = new Student("John Doe");
        student.addGrade(85);
        student.addGrade(90);

        Course course = new Course("Computer Science");
        course.addStudent(student);

        ZipArchiveEntry entry = manager.getEntry(0);
        /* read */ long size = entry.getSize();
        System.out.println("Size of example.txt: " + size);

        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getName());
            for (int grade : s.getGrades()) {
                System.out.println("Grade: " + grade);
            }
        }
    }
}