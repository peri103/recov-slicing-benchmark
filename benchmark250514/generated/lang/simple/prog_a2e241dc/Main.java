import org.apache.commons.lang3.mutable.MutableShort;

public class Main {
    public static void main(String[] args) {
        MutableShort mutableShort = new MutableShort();
        /* write */ mutableShort.setValue((short) 42);
        /* read */ short value = mutableShort.getValue();
        System.out.println(value);
    }
}