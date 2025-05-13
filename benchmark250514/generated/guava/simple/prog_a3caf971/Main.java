import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of a concrete subclass of ForwardingList
        MyForwardingList<Integer> list = new MyForwardingList<>(new ArrayList<>());

        /* write */ list.add(42);
        /* read */ int value = list.get(0);

        System.out.println(value);
    }
}

// Concrete subclass of ForwardingList
class MyForwardingList<E> extends ForwardingList<E> {
    private final List<E> delegate;

    public MyForwardingList(List<E> delegate) {
        this.delegate = delegate;
    }

    @Override
    protected List<E> delegate() {
        return delegate;
    }
}