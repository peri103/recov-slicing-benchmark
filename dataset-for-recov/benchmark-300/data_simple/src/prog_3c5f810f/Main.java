import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        /* write */ queue.put(1);
        /* read */ int value = queue.take();
        System.out.println(value);
    }
}