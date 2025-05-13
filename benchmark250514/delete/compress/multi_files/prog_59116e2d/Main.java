import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a wrapper for DumpArchiveEntry
        DumpArchiveEntryWrapper entryWrapper = new DumpArchiveEntryWrapper();
        entryWrapper.setCompressedSize(2048);

        // Create students and courses
        Student student1 = new Student("John Doe");
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 4);

        // Enroll student in courses
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);

        // Display student information
        System.out.println("Student: " + student1.getName());
        for (Course course : student1.getCourses()) {
            System.out.println("Enrolled in: " + course.getTitle() + " (" + course.getCredits() + " credits)");
        }

        // Use the read method from DumpArchiveEntryWrapper
        /* read */ long compressedSize = entryWrapper.getCompressedSize();
        System.out.println("Compressed Size: " + compressedSize);
    }
}