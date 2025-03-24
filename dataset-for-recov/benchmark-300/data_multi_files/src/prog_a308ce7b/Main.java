import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(42);
        
        // Unrelated operations
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        int stackValue = stack.pop();
        System.out.println("Popped value from stack: " + stackValue);
        
        /* read */ Integer score = student.getScore();
        System.out.println("Peeked value from the student's queue: " + score);
        
        // Additional operations to make the program more complex
        for (int i = 0; i < 5; i++) {
            stack.push(i * 5);
        }
        
        while (!stack.isEmpty()) {
            System.out.println("Stack value: " + stack.pop());
        }
    }
}