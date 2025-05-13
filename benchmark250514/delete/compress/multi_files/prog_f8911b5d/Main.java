import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntryWrapper entryWrapper = new DumpArchiveEntryWrapper();
        Student student = new Student("John Doe");

        // Enroll the student in some courses
        student.enrollCourse("Mathematics");
        student.enrollCourse("Physics");
        student.enrollCourse("Chemistry");

        // Set the group name using the write method
        entryWrapper.setGroupName("exampleGroupName");

        // Retrieve and print the student's courses
        ArrayList<String> courses = student.getCourses();
        System.out.println("Courses enrolled by " + student.getName() + ":");
        for (String course : courses) {
            System.out.println(course);
        }

        // Retrieve group name using the read method
        /* read */ String groupName = entryWrapper.getGroupName();
        System.out.println("Group Name: " + groupName);
    }
}