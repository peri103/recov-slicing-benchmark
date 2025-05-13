import org.apache.commons.lang3.mutable.MutableBoolean;

public class Main {
    public static void main(String[] args) {
        MutableBoolean mutableBoolean = new MutableBoolean();
        /* write */ mutableBoolean.setValue(true);
        /* read */ boolean value = mutableBoolean.getValue();
        System.out.println(value);
    }
}