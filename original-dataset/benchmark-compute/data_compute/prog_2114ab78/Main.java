import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        int distractor = 5;
        boolean condition = (distractor % 5 == 0) && (stack.size() > 3);
        stack.pop();
        stack.push(10);
        if (condition) {
            stack.push(42);
        } else {
            stack.push(100);
        }
        for (int i = 0; i < 3; i++) {
            stack.push(i * 100);
            stack.pop();
        }
        stack.push(999);
        /* write */ stack.pop();
        /* read */ int ret = stack.get(stack.size() - 2);
        System.out.println(ret);
    }
}
