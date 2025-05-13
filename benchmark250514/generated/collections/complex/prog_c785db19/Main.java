import org.apache.commons.collections4.bag.HashBag;

public class Main {
    public static void main(String[] args) {
        HashBag<String> bag = new HashBag<>();
        HashBag<String> anotherBag = new HashBag<>();

        // Adding elements to anotherBag
        anotherBag.add("banana");
        anotherBag.add("orange");
        anotherBag.add("banana");

        // Iterating and printing the contents of anotherBag
        for (String item : anotherBag.uniqueSet()) {
            System.out.println(item + ": " + anotherBag.getCount(item));
        }

        // Adding unrelated logic to increase program complexity
        int sumOfCounts = 0;
        for (String item : anotherBag.uniqueSet()) {
            sumOfCounts += anotherBag.getCount(item);
        }
        System.out.println("Sum of counts in anotherBag: " + sumOfCounts);

        /* write */ bag.add("apple");

        // Adding more unrelated logic
        bag.add("apple");
        bag.add("orange");
        System.out.println("Unique items in bag:");
        for (String item : bag.uniqueSet()) {
            System.out.println(item);
        }

        // Additional processing
        int totalItems = 0;
        for (String item : bag.uniqueSet()) {
            totalItems += bag.getCount(item);
        }
        System.out.println("Total items in bag: " + totalItems);

        /* read */ int count = bag.getCount("apple");

        System.out.println(count);

        // Adding more unrelated logic
        for (String item : anotherBag.uniqueSet()) {
            bag.add(item);
        }
        System.out.println("Combined bag contents:");
        for (String item : bag.uniqueSet()) {
            System.out.println(item + ": " + bag.getCount(item));
        }
    }
}