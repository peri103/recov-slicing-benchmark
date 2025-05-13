import org.apache.commons.lang3.mutable.MutableBoolean;

public class MutableBooleanWrapper {
    private MutableBoolean mutableBoolean = new MutableBoolean();

    public void setValue(boolean value) {
        /* write */ mutableBoolean.setValue(value);
    }

    public boolean getValue() {
        return mutableBoolean.getValue();
    }
}