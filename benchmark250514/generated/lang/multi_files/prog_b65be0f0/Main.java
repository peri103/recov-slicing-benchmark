import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TextManipulator textManipulator = new TextManipulator("Hello World");
        textManipulator.modifyText(6, 'J');

        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        /* read */ String modifiedText = textManipulator.getText();
        System.out.println("Modified Text: " + modifiedText);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}