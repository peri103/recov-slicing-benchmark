import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addData(1);
        Stack<Integer> stack = student.getDataStack();
        /* read */ int value = stack.pop();
        System.out.println("Read value: " + value);

        // Additional operations
        student.addData(10);
        student.addData(20);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}