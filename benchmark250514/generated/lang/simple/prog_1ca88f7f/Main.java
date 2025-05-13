import org.apache.commons.lang3.mutable.MutableInt;

public class Main {
    public static void main(String[] args) {
        MutableInt mutableInt = new MutableInt();
        /* write */ mutableInt.setValue(42);
        /* read */ int value = mutableInt.getValue();
        System.out.println(value);
    }
}