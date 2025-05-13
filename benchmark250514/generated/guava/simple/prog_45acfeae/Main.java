import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an anonymous subclass of ForwardingList to use the provided write and read methods
        ForwardingList<Integer> forwardingList = new ForwardingList<Integer>() {
            private final List<Integer> delegate = new ArrayList<>();

            @Override
            protected List<Integer> delegate() {
                return delegate;
            }
        };

        /* write */ forwardingList.add(42);
        /* read */ int value = forwardingList.get(0);
        System.out.println(value);
    }
}