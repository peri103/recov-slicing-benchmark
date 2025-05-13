import org.apache.commons.lang3.mutable.MutableDouble;

public class MutableData {
    private MutableDouble mutableDouble = new MutableDouble();

    public void setDoubleValue(double value) {
        /* write */ mutableDouble.setValue(value);
    }

    public double getDoubleValue() {
        return mutableDouble.getValue();
    }
}