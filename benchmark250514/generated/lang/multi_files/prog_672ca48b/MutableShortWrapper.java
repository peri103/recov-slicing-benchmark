import org.apache.commons.lang3.mutable.MutableShort;

public class MutableShortWrapper {
    private MutableShort mutableShort = new MutableShort();

    public void setShortValue(short value) {
        /* write */ mutableShort.setValue(value);
    }

    public short getShortValue() {
        return mutableShort.getValue();
    }
}