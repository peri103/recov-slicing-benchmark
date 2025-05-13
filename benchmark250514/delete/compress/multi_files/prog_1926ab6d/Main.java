public class Main {
    public static void main(String[] args) {
        // Create a ZipEntryManager and add entries
        ZipEntryManager zipManager = new ZipEntryManager();
        zipManager.addEntry("entry1");
        zipManager.addEntry("entry2");

        // Set a new name for the first entry
        zipManager.setEntryName(0, "newEntry1");

        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice"));
        course.addStudent(new Student("Bob"));

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
        }

        // Read and print the name of the first entry
        /* read */ String entryName = zipManager.getEntryName(0);
        System.out.println("Updated Zip Entry Name: " + entryName);
    }
}