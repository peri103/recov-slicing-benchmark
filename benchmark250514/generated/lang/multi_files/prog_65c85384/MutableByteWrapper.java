import org.apache.commons.lang3.mutable.MutableByte;

public class MutableByteWrapper {
    private MutableByte mutableByte = new MutableByte();

    public void setValue(byte value) {
        /* write */ mutableByte.setValue(value);
    }

    public byte getValue() {
        return mutableByte.getValue();
    }
}