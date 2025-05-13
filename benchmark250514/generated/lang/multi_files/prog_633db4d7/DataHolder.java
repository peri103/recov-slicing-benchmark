import org.apache.commons.lang3.mutable.MutableDouble;

public class DataHolder {
    private MutableDouble mutableDouble = new MutableDouble();

    public void setDoubleValue(double value) {
        /* write */ mutableDouble.setValue(value);
    }

    public double getDoubleValue() {
        return mutableDouble.getValue();
    }
}
 