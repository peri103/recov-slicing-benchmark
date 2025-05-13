import org.apache.commons.lang3.mutable.MutableFloat;

public class Main {
    public static void main(String[] args) {
        MutableFloat mutableFloat = new MutableFloat();
        /* write */ mutableFloat.setValue(10.5f);
        /* read */ float value = mutableFloat.getValue();
        System.out.println(value);
    }
}