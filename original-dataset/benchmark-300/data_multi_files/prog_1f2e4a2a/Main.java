import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        try {
            Course course = new Course();
            Student student = new Student(1, "Alice");
            
            // Enroll the student in the course
            course.enrollStudent(student.getId());
            
            // Add some unrelated operations
            ArrayList<Integer> list = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                list.add(i * 10);
                linkedList.add(i * 20);
            }
            
            // Process the list and linked list
            for (Integer num : list) {
                System.out.println("ArrayList value: " + num);
            }
            for (Integer num : linkedList) {
                System.out.println("LinkedList value: " + num);
            }
            
            // Get the next student from the course
            /* read */ int nextStudentId = course.getNextStudent();
            System.out.println("Next student ID: " + nextStudentId);
            
            // Add more operations
            for (int i = 5; i < 10; i++) {
                list.add(i * 10);
            }
            for (Integer num : list) {
                System.out.println("Updated ArrayList value: " + num);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}