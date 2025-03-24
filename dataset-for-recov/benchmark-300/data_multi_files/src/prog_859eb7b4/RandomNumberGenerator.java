import java.util.Random;
import java.util.Stack;

public class RandomNumberGenerator {
    private Stack<Integer> stack = new Stack<>();
    private Random random = new Random();

    public void generateNumbers(int count) {
        for (int i = 0; i < count; i++) {
            stack.push(random.nextInt(100));
        }
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}
