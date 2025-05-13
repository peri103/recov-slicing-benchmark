import org.apache.commons.collections4.list.TreeList;

public class Main {
    public static void main(String[] args) {
        TreeList<Integer> treeList = new TreeList<>();
        
        // Additional TreeList operations
        TreeList<String> stringList = new TreeList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        // Another list to demonstrate more operations
        TreeList<Double> doubleList = new TreeList<>();
        for (double i = 0.5; i < 5.0; i += 0.5) {
            doubleList.add(i);
        }
        
        // Some arithmetic operations
        int a = 10;
        int b = 20;
        int sum = a + b;
        int product = a * b;
        
        // Manipulate stringList
        String greeting = stringList.get(0) + " " + stringList.get(1);
        System.out.println("Greeting: " + greeting);
        
        // Work with doubleList
        double sumDoubles = 0.0;
        for (Double d : doubleList) {
            sumDoubles += d;
        }
        System.out.println("Sum of doubles: " + sumDoubles);

        // Write to treeList
        /* write */ treeList.add(42);

        // More operations on treeList
        treeList.add(84);
        treeList.add(168);
        
        // Manipulate the treeList further
        int firstElement = treeList.get(0);
        int secondElement = treeList.get(1);
        System.out.println("First two elements: " + firstElement + ", " + secondElement);
        
        // Final read operation
        /* read */ int value = treeList.get(0);
        System.out.println("Read value: " + value);
        
        // Perform some logic with the read value
        if (value > 40) {
            System.out.println("Value is greater than 40");
        } else {
            System.out.println("Value is 40 or less");
        }
    }
}