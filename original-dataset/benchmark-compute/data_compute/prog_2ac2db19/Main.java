import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        int x = (int) Math.pow(2, 3);
        int y = 55;
        int z = x * 3 + y - 200;
        if (z % 2 == 0) {
            stack.push(400);
        } else {
            /* write */stack.push(500);
        }
        stack.push(600);
        int temp = stack.peek() + 1000;
        stack.pop();
        stack.push(temp);
        stack.push(700);
        stack.pop();
        if (temp > 1500) {
            stack.push(800);
            stack.pop();
        } else {
            stack.push(900);
            stack.pop();
        }
        /* read */int ret = stack.get(3);
        System.out.println("Retrieved value: " + ret);
    }
}