import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = new ImmutableList.Builder<>();
        ArrayList<String> stringList = new ArrayList<>();
        
        // Adding elements to the string list
        stringList.add("Hello");
        stringList.add("World");
        
        // Perform operations on stringList
        for (String str : stringList) {
            System.out.println("String List Element: " + str);
        }

        // Adding elements to the builder
        builder.add(1);
        builder.add(2);
        builder.add(3);
        
        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);
        
        /* write */ builder.add(42);
        
        // More operations on builder
        builder.add(5);
        builder.add(6);
        
        ImmutableList<Integer> list = builder.build();
        
        // Perform operations on the ImmutableList
        for (int num : list) {
            System.out.println("Immutable List Element: " + num);
        }
        
        /* read */ int value = list.get(0);
        System.out.println("Read value: " + value);
        
        // Adding more complexity with additional calculations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 3: " + product);
    }
}