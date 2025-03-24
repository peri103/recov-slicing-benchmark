import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DataWriter writer = new DataWriter();
        writer.writeData(42);

        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        DataReader reader = new DataReader(writer.getDataList());
        int value = reader.readData();
        System.out.println("The last value in the list is: " + value);
    }
}