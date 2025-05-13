import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a ForwardingList instance using an ArrayList as the delegate
        ForwardingList<Integer> list = new ForwardingList<Integer>() {
            private final List<Integer> delegate = new ArrayList<>();

            @Override
            protected List<Integer> delegate() {
                return delegate;
            }
        };

        /* write */ list.add(42); // Write a value to the list
        /* read */ int value = list.get(0); // Read the value from the list
        System.out.println(value); // Output the read value
    }
}