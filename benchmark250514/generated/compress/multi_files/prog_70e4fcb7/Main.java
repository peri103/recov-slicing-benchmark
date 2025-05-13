public class Main {
    public static void main(String[] args) {
        // Initialize GzipParametersHandler
        GzipParametersHandler gzipHandler = new GzipParametersHandler();
        
        // Set a comment in GzipParameters
        gzipHandler.setGzipComment("This is a test comment");

        // Create students and courses
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        
        // Enroll students in courses
        alice.enrollCourse("Mathematics");
        bob.enrollCourse("Science");
        
        // Add students to courses
        math.addStudent(alice);
        science.addStudent(bob);

        // Display student information
        for (Student student : math.getStudents()) {
            System.out.println("Student in Math: " + student.getName());
        }

        for (Student student : science.getStudents()) {
            System.out.println("Student in Science: " + student.getName());
        }

        // Read the comment using getGzipComment method
        /* read */ String comment = gzipHandler.getGzipComment();
        
        // Print the read comment
        System.out.println("Gzip Comment: " + comment);
    }
}