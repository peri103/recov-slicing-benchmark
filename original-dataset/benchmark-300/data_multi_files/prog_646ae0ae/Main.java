import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java Programming");
        Student student = new Student("Alice");
        course.addStudent(student);

        student.addNote("First note added by Alice");

        // Adding more students and notes
        Student student2 = new Student("Bob");
        course.addStudent(student2);
        student2.addNote("Bob's first note");

        // Retrieving the first note added by Alice
        CopyOnWriteArrayList<String> notes = student.getNotes();
        /* read */ String firstNote = notes.get(0);
        System.out.println("First note by " + student.getName() + ": " + firstNote);

        // Printing all students in the course
        System.out.println("Students in " + course.getCourseName() + ":");
        for (Student s : course.getStudents()) {
            System.out.println(s.getName());
        }
    }
}