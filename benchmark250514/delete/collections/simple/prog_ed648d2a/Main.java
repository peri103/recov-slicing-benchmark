import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> predicate = object -> object instanceof Integer;
        Bag<Integer> hashBag = new HashBag<>();
        PredicatedBag<Integer> predicatedBag = new PredicatedBag<>(hashBag, predicate);

        /* write */ predicatedBag.add(10);
        
        /* read */ int count = predicatedBag.getCount(10);
        System.out.println(count);
    }
}