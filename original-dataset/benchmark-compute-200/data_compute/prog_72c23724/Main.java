import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        int conditionVar = calculateConditionValue(stack);
        if (conditionVar > 10) {
            /* write */ stack.push(-1);
        } else {
            stack.push(9999);
        }
        stack.push(100);
        stack.pop();
        stack.push(200);
        stack.push(300);
        Integer auxiliary = stack.get(3);
        /* read */ int ret = stack.get(5);
        System.out.println("Value at read point: " + ret);
    }
    public static int calculateConditionValue(Stack<Integer> stack) {
        int sum = 0;
        for (int value : stack) {
            sum += value;
        }
        return sum % 15;
    }
}
