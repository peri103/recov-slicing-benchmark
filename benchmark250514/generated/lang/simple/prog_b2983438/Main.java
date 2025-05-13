import org.apache.commons.lang3.mutable.MutableByte;

public class Main {
    public static void main(String[] args) {
        MutableByte mutableByte = new MutableByte((byte) 0);
        /* write */ mutableByte.setValue((byte) 10);
        /* read */ byte value = mutableByte.getValue();
        System.out.println(value);
    }
}