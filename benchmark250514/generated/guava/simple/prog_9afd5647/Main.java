import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> baseSet = new HashSet<>();
        ForwardingSet<String> forwardingSet = new ForwardingSet<String>() {
            @Override
            protected Set<String> delegate() {
                return baseSet;
            }
        };
        
        /* write */ forwardingSet.add("example");
        /* read */ boolean containsValue = forwardingSet.contains("example");
        
        System.out.println(containsValue);
    }
}