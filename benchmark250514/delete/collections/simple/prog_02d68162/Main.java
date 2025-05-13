import org.apache.commons.collections4.buffer.CircularFifoBuffer;

public class Main {
    public static void main(String[] args) {
        CircularFifoBuffer<Integer> buffer = new CircularFifoBuffer<>(10);
        /* write */ buffer.add(42);
        /* read */ int value = buffer.get();
        System.out.println(value);
    }
}