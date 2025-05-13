public class Main {
    public static void main(String[] args) {
        // Create a new ArchiveEntryManager
        ArchiveEntryManager manager = new ArchiveEntryManager("testfile");
        
        // Set CRC value
        manager.setEntryCrc(12345L);

        // Create a new course and add students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Output enrolled students
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        // Read CRC value
        /* read */ long crcValue = manager.getEntryCrc();
        System.out.println("CRC Value: " + crcValue);
    }
}