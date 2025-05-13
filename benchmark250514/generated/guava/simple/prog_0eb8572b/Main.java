import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> originalSet = new HashSet<>();
        ForwardingSet<String> forwardingSet = new ForwardingSet<String>() {
            @Override
            protected Set<String> delegate() {
                return originalSet;
            }
        };

        /* write */ forwardingSet.add("Hello");
        /* read */ boolean containsValue = forwardingSet.contains("Hello");
        System.out.println(containsValue);
    }
}