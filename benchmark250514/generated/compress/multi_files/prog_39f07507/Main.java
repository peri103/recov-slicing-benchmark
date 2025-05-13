public class Main {
    public static void main(String[] args) {
        // Manage JarArchiveEntry
        JarEntryManager jarManager = new JarEntryManager("example.jar");
        jarManager.setCrcValue(123456789L);

        // Create a course and add students
        Course course = new Course("Computer Science");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.addScore(85);
        bob.addScore(90);

        course.addStudent(alice);
        course.addStudent(bob);

        // Display course and student details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Scores: " + student.getScores());
        }

        // Retrieve and display CRC value
        /* read */ long crcValue = jarManager.getCrcValue();
        System.out.println("CRC Value: " + crcValue);
    }
}