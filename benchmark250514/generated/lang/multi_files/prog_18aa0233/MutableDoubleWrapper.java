import org.apache.commons.lang3.mutable.MutableDouble;

public class MutableDoubleWrapper {
    private MutableDouble mutableDouble = new MutableDouble();

    public void setValue(double value) {
        /* write */ mutableDouble.setValue(value);
    }

    public double getValue() {
        return mutableDouble.getValue();
    }
}