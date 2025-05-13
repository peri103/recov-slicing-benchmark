import com.google.common.collect.MinMaxPriorityQueue;

public class Main {
    public static void main(String[] args) {
        MinMaxPriorityQueue<Integer> queue = MinMaxPriorityQueue.create();
        /* write */ queue.offer(10);
        /* read */ Integer value = queue.peek();
        System.out.println(value);
    }
}