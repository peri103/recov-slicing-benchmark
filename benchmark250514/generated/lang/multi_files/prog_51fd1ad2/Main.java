import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrManipulator strManipulator = new StrManipulator("Hello World");
        strManipulator.modifyString();

        Course course = new Course("Mathematics");
        Student alice = new Student("Alice", 20);
        Student bob = new Student("Bob", 22);

        course.addStudent(alice);
        course.addStudent(bob);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }

        /* read */ String result = strManipulator.getResult();
        System.out.println("Modified String: " + result);

        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Max number is: " + max);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + " is: " + numbers.get(i));
        }
    }
}