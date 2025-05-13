import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize TarEntryHandler
        TarEntryHandler tarHandler = new TarEntryHandler("example.txt");
        
        // Set the mode of the tar entry
        tarHandler.setEntryMode(0644);

        // Create a new course and add students to it
        Course javaCourse = new Course("Java Programming");
        javaCourse.addStudent(new Student("Alice", 20));
        javaCourse.addStudent(new Student("Bob", 22));

        // Print course information
        System.out.println("Course: " + javaCourse.getCourseName());
        for (Student student : javaCourse.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Create a hashmap to store student ages
        HashMap<String, Integer> studentAges = new HashMap<>();
        for (Student student : javaCourse.getStudents()) {
            studentAges.put(student.getName(), student.getAge());
        }

        // Print the student ages
        for (String name : studentAges.keySet()) {
            System.out.println("Name: " + name + ", Age: " + studentAges.get(name));
        }

        // Read the mode of the tar entry
        /* read */ int mode = tarHandler.getEntryMode();
        System.out.println("Mode of the tar entry: " + mode);
    }
}