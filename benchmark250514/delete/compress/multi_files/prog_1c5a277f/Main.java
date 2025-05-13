public class Main {
    public static void main(String[] args) {
        // Manage archive entries
        ArchiveEntryManager manager = new ArchiveEntryManager();
        manager.addEntry("example.txt", 100, 12345);
        manager.addEntry("another.txt", 200, 67890);

        // Retrieve and read group ID from the first entry
        ArArchiveEntry entry = manager.getEntry(0);
        /* read */ long groupId = entry.getGroupId();
        System.out.println("Group ID of first entry: " + groupId);

        // Manage students and courses
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        Course course = new Course("Computer Science");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Print enrolled students
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getStudentId());
        }
    }
}