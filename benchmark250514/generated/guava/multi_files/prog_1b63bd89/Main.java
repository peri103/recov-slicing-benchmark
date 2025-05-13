public class Main {
    public static void main(String[] args) {
        RangeSetOperations rangeSetOps = new RangeSetOperations();
        RangeMapOperations rangeMapOps = new RangeMapOperations();

        // Add ranges to RangeMap
        rangeMapOps.addRangeWithLabel(1, 5, "Low");
        rangeMapOps.addRangeWithLabel(6, 10, "Medium");
        rangeMapOps.addRangeWithLabel(11, 15, "High");

        // Add range to RangeSet
        rangeSetOps.addRange(1, 10);

        // Perform operations on RangeMap
        System.out.println("Label for 3: " + rangeMapOps.getLabel(3));
        System.out.println("Label for 7: " + rangeMapOps.getLabel(7));
        System.out.println("Label for 12: " + rangeMapOps.getLabel(12));

        // Additional logic and operations
        for (int i = 1; i <= 15; i++) {
            System.out.println("Value " + i + " falls in range: " + rangeMapOps.getLabel(i));
        }

        // Simulate complex logic
        int sumInRange = 0;
        for (int i = 1; i <= 10; i++) {
            if (rangeSetOps.containsValue(i)) {
                sumInRange += i;
            }
        }
        System.out.println("Sum of values within the range 1 to 10: " + sumInRange);

        // Check if a value is in the RangeSet
        /* read */ boolean containsValue = rangeSetOps.containsValue(5);
        System.out.println("RangeSet contains 5: " + containsValue);
    }
}