import com.google.common.util.concurrent.AtomicDouble;

public class AtomicDoubleHandler {
    private AtomicDouble atomicDouble = new AtomicDouble(0.0);

    public void addValue(double value) {
        /* write */ atomicDouble.addAndGet(value);
    }

    public double getValue() {
        return atomicDouble.get();
    }
}
