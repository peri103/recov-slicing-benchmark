import java.util.List;

public class Main {
    public static void main(String[] args) {
        RangeMapHandler rangeMapHandler = new RangeMapHandler();
        rangeMapHandler.addRange(1, 10, "Value1");

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }

        /* read */ String value = rangeMapHandler.getValue(5);
        System.out.println("RangeMap Value at 5: " + value);
    }
}