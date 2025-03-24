import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addData(1);
        Stack stack = student.getStack();
        /* read */ int value = (Integer) stack.peek();
        System.out.println(value);
    }
}