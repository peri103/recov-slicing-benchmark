public class Main {
    public static void main(String[] args) {
        // Create a DataStore instance
        DataStore dataStore = new DataStore();

        // Create a Course and Students
        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add scores to students
        alice.addScore(95);
        bob.addScore(88);

        // Add students to the course
        mathCourse.addStudent(alice);
        mathCourse.addStudent(bob);

        // Store a value in the DataStore
        dataStore.putValue("key", 42);

        // Read the value from the DataStore
        /* read */ int value = dataStore.getValue("key");

        // Print the value
        System.out.println("Value from DataStore: " + value);

        // Print course and student details
        System.out.println("Course: " + mathCourse.getCourseName());
        for (Student student : mathCourse.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Scores: " + student.getScores());
        }
    }
}