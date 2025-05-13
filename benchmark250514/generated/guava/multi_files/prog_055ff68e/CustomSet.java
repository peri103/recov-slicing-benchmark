import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;

public class CustomSet extends ForwardingSet<Integer> {
    private Set<Integer> backingSet = new HashSet<>();

    @Override
    protected Set<Integer> delegate() {
        return backingSet;
    }

    public void addElement(int element) {
        /* write */ add(element);
    }
}
