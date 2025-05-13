import org.apache.commons.lang3.mutable.MutableInt;

public class MutableIntWrapper {
    private MutableInt mutableInt = new MutableInt();

    public void setValue(int value) {
        /* write */ mutableInt.setValue(value);
    }

    public int getValue() {
        return mutableInt.getValue();
    }
}
