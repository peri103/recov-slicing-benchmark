import org.apache.commons.lang3.mutable.MutableFloat;

public class MutableFloatWrapper {
    private MutableFloat mutableFloat = new MutableFloat();

    public void setValue(float value) {
        /* write */ mutableFloat.setValue(value);
    }

    public float getValue() {
        return mutableFloat.getValue();
    }
}