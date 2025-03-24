import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Course course = new Course("Advanced Java Programming");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.addStudent(student1);
        course.addStudent(student2);

        Random random = new Random();
        int data = random.nextInt(100);

        // Student 1 submits data
        student1.submitData(data);

        // Student 2 retrieves data
        int retrievedData = student2.getData();

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Student " + student1.getName() + " submitted data: " + data);
        System.out.println("Student " + student2.getName() + " retrieved data: " + retrievedData);
    }
}