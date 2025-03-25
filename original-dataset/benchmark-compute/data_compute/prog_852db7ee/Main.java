import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int control = 0;
        stack.push(5);
        stack.push(10);
        if (control == 0) {
            /* write */ stack.push(20);
        } else {
            stack.push(30);
        }
        stack.push(15);
        stack.push(25);
        int m = stack.size();
        int n = (control * m + 2) / 2;
        if (n % 2 == 0) {
            stack.pop();
            stack.push(40);
        }
        if (m - control == 5) {
            stack.pop();
        }
        /* read */ int ret = stack.get(2);
        System.out.println(ret);
    }
}
