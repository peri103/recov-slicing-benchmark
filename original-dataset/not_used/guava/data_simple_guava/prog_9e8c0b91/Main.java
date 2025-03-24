import com.google.common.util.concurrent.AtomicDouble;

public class Main {
    public static void main(String[] args) {
        AtomicDouble atomicDouble = new AtomicDouble(0.0);
        /* write */ double newValue = atomicDouble.addAndGet(5.0);
        /* read */ double value = atomicDouble.get();
        System.out.println("Written Value: " + newValue);
        System.out.println("Read Value: " + value);
    }
}