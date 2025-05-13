import org.apache.commons.lang3.mutable.MutableInt;

public class MutableNumber {
    private MutableInt mutableInt = new MutableInt();

    public void setNumber(int value) {
        /* write */ mutableInt.setValue(value);
    }

    public int getNumber() {
        return mutableInt.getValue();
    }
}