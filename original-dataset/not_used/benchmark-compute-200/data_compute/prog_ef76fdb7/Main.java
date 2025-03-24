import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        int randomComputation = (int) (Math.random() * 10);
        int conditionalVar = randomComputation > 5 ? 1 : 0;
        stack.push(conditionalVar);
        stack.pop();
        if (randomComputation % 2 == 0) {
            /* write */ stack.push(500);
        } else {
            stack.push(600);
        }
        stack.push(999);
        stack.pop();
        /* read */ int ret = stack.get(stack.size() - 1);
        System.out.println("Value read from stack: " + ret);
    }
}
