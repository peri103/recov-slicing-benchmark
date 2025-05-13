public class Main {
    public static void main(String[] args) {
        GzipSettings gzipSettings = new GzipSettings();
        
        // Set the operating system for GzipParameters
        gzipSettings.setOperatingSystem(3);
        
        // Create a course and add students
        Course course = new Course("Computer Science");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        
        alice.addGrade(85);
        alice.addGrade(90);
        bob.addGrade(78);
        bob.addGrade(82);
        
        course.addStudent(alice);
        course.addStudent(bob);
        
        // Calculate and display course average
        double courseAverage = course.calculateCourseAverage();
        System.out.println("Course Average: " + courseAverage);
        
        // Retrieve and print the operating system set in GzipParameters
        /* read */ int os = gzipSettings.getOperatingSystem();
        System.out.println("Operating System: " + os);
    }
}