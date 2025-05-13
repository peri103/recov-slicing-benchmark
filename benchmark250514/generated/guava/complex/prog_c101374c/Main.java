import com.google.common.collect.MinMaxPriorityQueue;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        MinMaxPriorityQueue<Integer> queue = MinMaxPriorityQueue.create();
        PriorityQueue<Integer> anotherQueue = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        /* write */ queue.offer(42);
        
        anotherQueue.offer(10);
        anotherQueue.offer(20);
        anotherQueue.offer(30);
        
        list.add(100);
        list.add(200);
        list.add(300);
        
        int anotherValue = anotherQueue.poll();
        System.out.println("Polled from anotherQueue: " + anotherValue);
        
        Collections.sort(list);
        for (int value : list) {
            System.out.println("Sorted list value: " + value);
        }
        
        /* read */ int value = queue.peek();
        System.out.println("Peeked from queue: " + value);
        
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of list values: " + sum);
        
        int maxValue = Collections.max(list);
        System.out.println("Max value in list: " + maxValue);
    }
}