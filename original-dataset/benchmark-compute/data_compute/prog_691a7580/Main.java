import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int x = 2023;
        int y = x * 5;
        int z = y - 1000;
        stack.push(42);
        stack.push(27);
        if (z % 2 == 0) {
            stack.push(99); 
        } else {
            /* write */ stack.push(13); 
        }
        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        stack.push(sum % 10);
        int a = 50;
        int b = a / 2;
        int c = b + 3;
        stack.push(3);
        stack.push(7);
        stack.push(21);
        stack.pop();
        /* read */ int ret = stack.get(2);
        System.out.println("Retrieved value: " + ret);  
    }
}