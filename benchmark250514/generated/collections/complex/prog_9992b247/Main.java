import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.list.PredicatedList;
import org.apache.commons.collections4.list.TreeList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all elements
        Predicate<Object> predicate = obj -> true;

        // Create a HashBag and wrap it with a PredicatedBag
        Bag<Object> hashBag = new HashBag<>();
        PredicatedBag<Object> predicatedBag = PredicatedBag.predicatedBag(hashBag, predicate);

        // Create a TreeList and wrap it with a PredicatedList
        List<Object> treeList = new TreeList<>();
        PredicatedList<Object> predicatedList = PredicatedList.predicatedList(treeList, predicate);

        // Add elements to the PredicatedList
        predicatedList.add("listElement1");
        predicatedList.add("listElement2");

        // Perform some operations on the PredicatedList
        for (Object element : predicatedList) {
            System.out.println("List Element: " + element);
        }

        // Add multiple elements to the PredicatedBag
        predicatedBag.add("exampleElement");
        predicatedBag.add("anotherElement");

        // Perform operations on the PredicatedBag
        for (Object element : predicatedBag.uniqueSet()) {
            System.out.println("Bag Element: " + element + ", Count: " + predicatedBag.getCount(element));
        }

        /* write */ predicatedBag.add("exampleElement");

        // More operations on the PredicatedList
        predicatedList.add("listElement3");
        predicatedList.add("listElement4");

        // Print the size of the PredicatedList
        System.out.println("PredicatedList Size: " + predicatedList.size());

        // Operations on PredicatedBag
        int totalCount = 0;
        for (Object element : predicatedBag.uniqueSet()) {
            totalCount += predicatedBag.getCount(element);
        }
        System.out.println("Total Bag Count: " + totalCount);

        /* read */ int count = predicatedBag.getCount("exampleElement");
        System.out.println("Example Element Count: " + count);

        // Further operations on the PredicatedList
        predicatedList.remove("listElement2");
        predicatedList.add("listElement5");

        // Print all elements in the PredicatedList
        for (Object element : predicatedList) {
            System.out.println("Updated List Element: " + element);
        }
    }
}