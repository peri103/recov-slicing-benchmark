import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        int temp = stack.pop();
        stack.push(temp * 2);
        /* write */ stack.push(20);
        if (temp > 8) {
            for(int i = 0; i < 3; i++) {
                stack.push(i);
            }
        } else {
            stack.pop();
        }
        stack.push(100);
        stack.push(200);
        stack.pop();
        stack.push(300);
        /* read */ int ret = stack.get(stack.indexOf(20));
        System.out.println(ret);
    }
}