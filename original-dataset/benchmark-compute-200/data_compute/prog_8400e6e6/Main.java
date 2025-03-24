import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        /* other operations */
        int rand = 5678 * 8765 + 101 + 111 + 121;
        /* other operations */
        int index = rand % 3;
        /* misleading operations */
        stack.push(5);
        stack.push(10);
        if (index == 1) {
            stack.pop();
        } else {
            stack.push(15);
        }
        stack.push(20);
        /* misleading operations */
        for(int i = 0; i < 2; i++) {
            stack.push(i * 100);
            stack.pop();
        }
        if (index != 1) {
            stack.pop();
        }
        /* write */ stack.push(30);
        /* other operations */
        if(stack.size() > 3) {
            stack.push(40);
        } else {
            stack.pop();
        }
        /* read */ int ret = stack.get(stack.indexOf(30));
    }
}
