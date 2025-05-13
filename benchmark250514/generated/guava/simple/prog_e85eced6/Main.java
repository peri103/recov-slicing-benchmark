import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> baseList = new ArrayList<>();
        ForwardingList<Integer> forwardingList = new ForwardingList<Integer>() {
            @Override
            protected List<Integer> delegate() {
                return baseList;
            }
        };

        /* write */ forwardingList.add(42);
        /* read */ int value = forwardingList.get(0);
        System.out.println(value);
    }
}