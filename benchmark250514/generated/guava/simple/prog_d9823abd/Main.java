import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ForwardingList<Integer> list = new ForwardingList<Integer>() {
            private final List<Integer> delegate = new ArrayList<>();

            @Override
            protected List<Integer> delegate() {
                return delegate;
            }
        };

        /* write */ list.add(42);
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}