public class Main {
    public static void main(String[] args) {
        // Manage archive entries
        ArchiveEntryManager manager = new ArchiveEntryManager("example.txt", 1000);
        manager.setAttributes(12345);

        // Create a course and enroll students
        Course course = new Course("Computer Science 101");
        course.enrollStudent("Alice");
        course.enrollStudent("Bob");

        // View enrolled students
        System.out.println("Enrolled students:");
        for (String student : course.getStudents()) {
            System.out.println(student);
        }

        // View archive entry attributes
        ArchiveEntryViewer viewer = new ArchiveEntryViewer(manager.getEntry());
        long attributes = viewer.viewAttributes();
        System.out.println("Archive Entry Attributes: " + attributes);
    }
}