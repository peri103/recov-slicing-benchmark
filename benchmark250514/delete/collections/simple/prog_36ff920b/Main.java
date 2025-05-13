import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all elements
        Predicate<Object> predicate = obj -> true;
        
        // Create a PredicatedBag with the predicate
        PredicatedBag<String> bag = new PredicatedBag<>(new HashBag<>(), predicate);
        
        /* write */ bag.add("example");
        
        /* read */ int count = bag.getCount("example");
        
        System.out.println(count);
    }
}