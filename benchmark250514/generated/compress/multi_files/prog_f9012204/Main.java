public class Main {
    public static void main(String[] args) {
        // Create a new GzipConfig and configure the OS
        GzipConfig gzipConfig = new GzipConfig();
        gzipConfig.configureOperatingSystem(3); // Set OS code

        // Create a course and add students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addGrade(85);
        student2.addGrade(90);

        course.addStudent(student1);
        course.addStudent(student2);

        // Get the configured OS code from GzipConfig
        /* read */ int osValue = gzipConfig.getConfiguredOperatingSystem();

        // Print the configured OS code
        System.out.println("Configured Operating System Code: " + osValue);

        // Print student details
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }
    }
}