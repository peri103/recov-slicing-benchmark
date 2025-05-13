import org.apache.commons.lang3.mutable.MutableLong;

public class MutableLongWrapper {
    private MutableLong mutableLong = new MutableLong();

    public void setValue(long value) {
        /* write */ mutableLong.setValue(value);
    }

    public long getValue() {
        return mutableLong.getValue();
    }
}
