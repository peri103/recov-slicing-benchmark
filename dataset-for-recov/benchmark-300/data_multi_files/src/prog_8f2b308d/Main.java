import java.util.concurrent.ConcurrentSkipListMap;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        course.addStudent(1, student1);
        course.addStudent(2, student2);

        ConcurrentSkipListMap<Integer, Student> studentsMap = course.getStudents();
        /* read */ Student retrievedStudent = studentsMap.get(1);

        System.out.println("Retrieved Student: " + retrievedStudent.getName() + ", Age: " + retrievedStudent.getAge());

        // Iterating through the students map and printing details
        for (Integer id : studentsMap.keySet()) {
            Student student = studentsMap.get(id);
            System.out.println("Student ID: " + id + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}