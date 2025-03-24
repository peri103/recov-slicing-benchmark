import java.util.Stack;
import java.util.Random;

public class StackManager {
    private Stack<Integer> stack = new Stack<>();

    public void fillStack() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(100);
            stack.push(num);
        }
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}
