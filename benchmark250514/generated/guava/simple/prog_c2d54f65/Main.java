import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> backingList = new ArrayList<>();
        ForwardingList<Integer> list = new ForwardingList<Integer>() {
            @Override
            protected List<Integer> delegate() {
                return backingList;
            }
        };

        /* write */ list.add(42);
        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}