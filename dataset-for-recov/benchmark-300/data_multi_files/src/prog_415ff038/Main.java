import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.storeGrade("Math", 95);
        
        Course mathCourse = new Course("Mathematics");
        mathCourse.addStudent(student);
        
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            linkedList.add("Element " + i);
        }
        
        for (String s : linkedList) {
            System.out.println("LinkedList value: " + s);
        }
        
        /* read */ Integer grade = student.getGrade("Math");
        System.out.println("Alice's grade in Math: " + grade);
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List value: " + list.get(i));
        }
    }
}