import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.list.PredicatedList;
import org.apache.commons.collections4.list.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a predicate that allows all elements
        Predicate<Object> predicate = new Predicate<Object>() {
            @Override
            public boolean evaluate(Object object) {
                return true;
            }
        };

        // Create a HashBag and wrap it with PredicatedBag using the predicate
        HashBag<Object> hashBag = new HashBag<>();
        PredicatedBag<Object> predicatedBag = PredicatedBag.predicatedBag(hashBag, predicate);

        // Create a PredicatedList using the same predicate
        ArrayList<Object> arrayList = new ArrayList<>();
        PredicatedList<Object> predicatedList = PredicatedList.predicatedList(arrayList, predicate);

        // Add elements to the PredicatedList
        predicatedList.add("item1");
        predicatedList.add("item2");

        // Perform operations on PredicatedList
        for (Object item : predicatedList) {
            System.out.println("List item: " + item);
        }

        // Add elements to the PredicatedBag
        predicatedBag.add("example1");
        predicatedBag.add("example2");

        // Perform operations on PredicatedBag
        System.out.println("Bag contains 'example1': " + predicatedBag.contains("example1"));
        System.out.println("Bag contains 'example2': " + predicatedBag.contains("example2"));

        /* write */ predicatedBag.add("example");

        // Additional operations to make the program complex
        for (int i = 0; i < 5; i++) {
            predicatedBag.add("item" + i);
        }

        int totalCount = 0;
        for (Object item : predicatedBag.uniqueSet()) {
            totalCount += predicatedBag.getCount(item);
        }
        System.out.println("Total count of items in bag: " + totalCount);

        /* read */ int count = predicatedBag.getCount("example");
        System.out.println(count);
    }
}