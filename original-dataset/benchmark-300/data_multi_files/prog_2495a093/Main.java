import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        // Adding student IDs to the course
        mathCourse.addStudentId(student1.getId());
        mathCourse.addStudentId(student2.getId());

        // Reading the first student ID from the course
        CopyOnWriteArrayList<Integer> studentIds = mathCourse.getStudentIds();
        /* read */ int firstStudentId = studentIds.get(0);

        System.out.println("Course: " + mathCourse.getCourseName());
        System.out.println("First Student ID: " + firstStudentId);

        // Printing all student IDs in the course
        System.out.println("All Student IDs in the course:");
        for (Integer id : studentIds) {
            System.out.println(id);
        }
    }
}