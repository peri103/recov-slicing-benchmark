import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.addData(42);

        // Simulating some complex operations
        LinkedList<Student> studentList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            Student s = new Student("Student " + i);
            s.addData(i * 10);
            studentList.add(s);
        }

        for (Student s : studentList) {
            System.out.println("Student: " + s.getDataList().getLast());
        }

        /* read */ int value = student.getDataList().getLast();
        System.out.println("Processed data: " + value);
    }
}