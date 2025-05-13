import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.FlushMode;

public class Main {
    public static void main(String[] args) {
        // Initialize DeflateCompressorOutputStream
        DeflateCompressorOutputStream deflateStream = new DeflateCompressorOutputStream(System.out);

        // Setup CompressorSettings and configure flush mode
        CompressorSettings compressorSettings = new CompressorSettings(deflateStream);
        compressorSettings.configureFlushMode(FlushMode.SYNC_FLUSH);

        // Setup CompressorReader to read the flush mode
        CompressorReader compressorReader = new CompressorReader(deflateStream);
        FlushMode flushMode = compressorReader.readFlushMode();
        System.out.println("FlushMode: " + flushMode);

        // Create a student and a course
        Student student = new Student("John Doe");
        Course course = new Course("Computer Science");

        // Enroll student in the course
        student.enrollCourse(course);
        course.addStudent(student);

        // Print enrolled courses for the student
        for (Course c : student.getCourses()) {
            System.out.println("Enrolled in: " + c.courseName);
        }

        // Print students in the course
        for (Student s : course.getStudents()) {
            System.out.println("Student in course: " + s.name);
        }
    }
}