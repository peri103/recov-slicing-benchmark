import org.apache.commons.collections4.buffer.CircularFifoBuffer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the CircularFifoBuffer with a capacity of 10
        CircularFifoBuffer buffer = new CircularFifoBuffer(10);

        // Initialize an ArrayList for additional operations
        ArrayList<Integer> extraList = new ArrayList<>();
        extraList.add(100);
        extraList.add(200);
        extraList.add(300);

        // Perform some unrelated operations with the ArrayList
        int sum = 0;
        for (int num : extraList) {
            sum += num;
        }
        System.out.println("Sum of extraList: " + sum);

        // Write to the CircularFifoBuffer
        /* write */ buffer.add(42);

        // Perform more unrelated operations
        extraList.add(400);
        extraList.remove(0);
        System.out.println("Updated extraList: " + extraList);

        // Perform some calculations
        int product = 1;
        for (int num : extraList) {
            product *= num;
        }
        System.out.println("Product of extraList: " + product);

        // Read from the CircularFifoBuffer
        /* read */ int value = (Integer) buffer.get(0);
        System.out.println("Value read from buffer: " + value);

        // Perform additional unrelated operations
        CircularFifoBuffer anotherBuffer = new CircularFifoBuffer(5);
        anotherBuffer.add(10);
        anotherBuffer.add(20);
        anotherBuffer.add(30);

        while (!anotherBuffer.isEmpty()) {
            System.out.println("Removed from anotherBuffer: " + anotherBuffer.remove());
        }

        // Final unrelated operation with extraList
        extraList.clear();
        System.out.println("Cleared extraList: " + extraList);
    }
}