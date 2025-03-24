import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        /* other operations */
        int total = 1000 + 2000;
        /* other operations */
        stack.push(total);
        /* other operations */
        int secret = (total % 2 == 0) ? 5 : 7;
        stack.push(secret);
        stack.pop();  
        /* write */ stack.push(42);
        stack.push(100);  
        if (secret > 10) {
            stack.push(12);
        } else {
            stack.push(15);
        }
        stack.peek();
        stack.pop();
        stack.push(-1);
        stack.push(secret + total);
        /* read */ int ret = stack.get(stack.size() - 3);
    }
}
