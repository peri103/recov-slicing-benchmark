import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        /* other operations */
        int misleadingSum = 1000;
        int misleadingFactor = 500;
        misleadingSum += misleadingFactor * 2;
        int conditionModifier = misleadingSum + 139;
        /* misleading add operations */
        if (conditionModifier % 2 == 0) {
            queue.add(5);
        } else {
            queue.add(10);
        }
        queue.add(15);
        /* write */
        queue.add(20);
        /* intermediate operations */
        queue.add(25);
        queue.remove(5);
        queue.add(30);
        queue.peek(); 
        int retrieveIndex = 0;
        int conditionEval = misleadingSum + 500 - 999;
        if (conditionEval % 3 == 0) {
            retrieveIndex = 1;
        }
        /* read */
        int ret = (int) queue.toArray()[retrieveIndex];
        System.out.println("The value read is: " + ret);
    }
}
