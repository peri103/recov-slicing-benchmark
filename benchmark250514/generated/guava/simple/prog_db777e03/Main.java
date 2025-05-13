import com.google.common.collect.ForwardingList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ForwardingList<Integer> list = new ForwardingList<Integer>() {
            private final ArrayList<Integer> delegate = new ArrayList<>();

            @Override
            protected ArrayList<Integer> delegate() {
                return delegate;
            }
        };

        /* write */ list.add(42);
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}