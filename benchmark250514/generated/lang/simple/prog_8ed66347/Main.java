import org.apache.commons.lang3.mutable.MutableBoolean;

public class Main {
    public static void main(String[] args) {
        // Initialize the MutableBoolean instance
        MutableBoolean mutableBoolean = new MutableBoolean();

        // Use the write method to set the value
        /* write */ mutableBoolean.setValue(true);

        // Use the read method to get the value
        /* read */ boolean value = mutableBoolean.getValue();

        // Print the value to ensure it is read correctly
        System.out.println(value);
    }
}