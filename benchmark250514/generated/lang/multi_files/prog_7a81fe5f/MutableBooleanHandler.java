import org.apache.commons.lang3.mutable.MutableBoolean;

public class MutableBooleanHandler {
    private MutableBoolean mutableBoolean = new MutableBoolean();

    public void setBooleanValue(boolean value) {
        /* write */ mutableBoolean.setValue(value);
    }

    public boolean getBooleanValue() {
        return mutableBoolean.getValue();
    }
}
