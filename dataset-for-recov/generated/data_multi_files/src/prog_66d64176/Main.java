public class Main {
    public static void main(String[] args) {
        SortedSetManager sortedSetManager = new SortedSetManager();
        ComplexOperations complexOperations = new ComplexOperations();

        complexOperations.populateHashSet();
        complexOperations.printHashSet();

        sortedSetManager.addValue(5);
        sortedSetManager.addValue(10);
        sortedSetManager.addValue(15);

        /* read */ boolean containsFive = sortedSetManager.containsValue(5);
        System.out.println("SortedSet contains 5: " + containsFive);

        for (Integer num : sortedSetManager.getSortedSet()) {
            System.out.println("SortedSet contains: " + num);
        }

        boolean containsTen = sortedSetManager.containsValue(10);
        System.out.println("SortedSet contains 10: " + containsTen);
    }
}