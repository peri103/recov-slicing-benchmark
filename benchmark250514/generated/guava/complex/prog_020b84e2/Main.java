import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;

public class Main {
    public static void main(String[] args) {
        Table<Integer, Integer, String> table = TreeBasedTable.create();
        Table<Integer, Integer, String> anotherTable = HashBasedTable.create();
        
        // Initializing values in anotherTable
        anotherTable.put(2, 2, "World");
        anotherTable.put(3, 3, "Java");
        
        // Adding more complexity with operations on anotherTable
        String anotherValue = anotherTable.get(2, 2);
        System.out.println("Value from anotherTable: " + anotherValue);
        
        for (int i = 0; i < 5; i++) {
            anotherTable.put(i, i, "Value " + i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("AnotherTable value at (" + i + "," + i + "): " + anotherTable.get(i, i));
        }
        
        // Operations on the original table
        /* write */ table.put(1, 1, "Hello");
        
        // Performing unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Further operations on anotherTable
        anotherTable.put(4, 4, "Complexity");
        System.out.println("AnotherTable value at (4,4): " + anotherTable.get(4, 4));
        
        /* read */ String value = table.get(1, 1);
        System.out.println(value);
        
        // Additional unrelated complexity
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}