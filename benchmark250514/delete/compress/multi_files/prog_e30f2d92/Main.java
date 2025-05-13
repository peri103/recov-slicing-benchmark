public class Main {
    public static void main(String[] args) {
        // Create a GzipConfig object and set flags
        GzipConfig gzipConfig = new GzipConfig();
        gzipConfig.setGzipFlags(4);

        // Create students and courses
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);

        // List enrolled students in Mathematics
        System.out.println("Enrolled students in " + course1.getCourseName() + ":");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        // Read the flags from the GzipConfig object
        /* read */ int flags = gzipConfig.getGzipFlags();
        System.out.println("Gzip Flags: " + flags);
    }
}