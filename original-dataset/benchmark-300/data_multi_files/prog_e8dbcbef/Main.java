import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.addData(99);

        Stack<Integer> dataStack = student.getDataStack();
        /* read */ int data = dataStack.pop();
        System.out.println("Data retrieved: " + data);

        // Additional processing
        if (!dataStack.isEmpty()) {
            System.out.println("Remaining data in stack: " + dataStack.pop());
        } else {
            System.out.println("No more data in stack.");
        }
    }
}