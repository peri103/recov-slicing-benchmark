import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArchiveHandler archiveHandler = new ArchiveHandler("example.txt", 1000);
        archiveHandler.setGroupId(12345);
        archiveHandler.addToArchiveMap();

        Course course = new Course("Computer Science");
        course.addGroupId(10001L);
        course.addGroupId(10002L);

        // Perform some operations with the Course object
        System.out.println("Course Name: " + course.getCourseName());
        for (Long id : course.getGroupIds()) {
            System.out.println("Course Group ID: " + id);
        }

        // Retrieve the group ID using the read method from ArchiveHandler
        /* read */ long groupId = archiveHandler.getGroupId();
        course.addGroupId(groupId);

        // Print the updated group IDs
        System.out.println("Updated Group IDs in Course: " + course.getGroupIds());
    }
}