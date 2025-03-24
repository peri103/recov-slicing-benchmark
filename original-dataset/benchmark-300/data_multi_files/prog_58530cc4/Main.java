import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.pushToStack(42);

        // Perform some unrelated operations
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            tempStack.push(i * 10);
        }

        // Access the stack from the student
        Stack<Integer> studentStack = student.getStack();
        /* read */ int value = studentStack.peek();
        System.out.println("Peeked value: " + value);

        // Additional unrelated code
        for (int i = 0; i < tempStack.size(); i++) {
            System.out.println("Temp stack value: " + tempStack.get(i));
        }
    }
}