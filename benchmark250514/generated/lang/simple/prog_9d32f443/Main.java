import org.apache.commons.lang3.mutable.MutableDouble;

public class Main {
    public static void main(String[] args) {
        MutableDouble mutableDouble = new MutableDouble();
        /* write */ mutableDouble.setValue(5.5);
        /* read */ double value = mutableDouble.getValue();
        System.out.println(value);
    }
}