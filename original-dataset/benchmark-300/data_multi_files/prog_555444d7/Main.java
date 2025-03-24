import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addValueToStack(42);
        Stack<Integer> stack = student.getStack();
        /* read */ int value = stack.peek();
        System.out.println("Value read from stack: " + value);
    }
}