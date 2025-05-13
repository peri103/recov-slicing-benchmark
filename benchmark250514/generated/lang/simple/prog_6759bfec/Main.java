import org.apache.commons.lang3.mutable.MutableLong;

public class Main {
    public static void main(String[] args) {
        MutableLong mutableLong = new MutableLong();
        /* write */ mutableLong.setValue(123456789L);
        /* read */ long value = mutableLong.getValue();
        System.out.println(value);
    }
}