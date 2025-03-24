import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int x = 42; 
        for (int i = 0; i < 3; i++) {
            x += i;
            stack.pop(); 
        }
        int condition = x % 3;
        /* misleading operations */
        if (condition == 0) {
            stack.push(40);
            stack.push(50);
            stack.pop();
        } else {
            stack.push(60);
            stack.push(70);
            stack.pop();
        }
        /* write */ stack.push(100);
        /* operations irrelevant to the read point */
        stack.push(200);
        stack.push(300);
        stack.pop(); 
        stack.push(400);
        stack.pop(); 
        x = x * 100 + Math.abs(x - 200);
        stack.push(x % 99);
        /* read */ int ret = stack.peek();
        System.out.println("The value retrieved is: " + ret); 
    }
}