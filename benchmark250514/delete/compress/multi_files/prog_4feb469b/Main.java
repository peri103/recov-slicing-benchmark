public class Main {
    public static void main(String[] args) {
        GroupManager groupManager = new GroupManager();
        groupManager.addEntry("entry1", 12345L);

        Student student = new Student("John Doe", 12345L);
        Course course = new Course("Computer Science");
        course.addStudent(student);

        // Perform some unrelated operations
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getName() + ", Group ID: " + s.getGroupId());
        }

        // Retrieve the group ID using the GroupManager
        CpioArchiveEntry entry = groupManager.getEntry("entry1");
        /* read */ long groupId = entry.getGroupId();
        System.out.println("Retrieved Group ID: " + groupId);
    }
}