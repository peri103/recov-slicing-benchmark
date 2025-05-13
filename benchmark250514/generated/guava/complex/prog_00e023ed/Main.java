import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableList.builder();
        ArrayList<Integer> auxiliaryList = new ArrayList<>();
        
        // Adding elements to auxiliaryList
        for (int i = 1; i <= 5; i++) {
            auxiliaryList.add(i * 10);
        }
        
        // Use auxiliaryList to perform some operations
        int sum = 0;
        for (int num : auxiliaryList) {
            sum += num;
        }
        System.out.println("Sum of auxiliaryList: " + sum);

        /* write */ builder.add(42);

        // Further operations using auxiliaryList
        for (int i = 0; i < auxiliaryList.size(); i++) {
            auxiliaryList.set(i, auxiliaryList.get(i) + 5);
        }

        // Building the ImmutableList
        ImmutableList<Integer> list = builder.build();

        // Perform other operations before reading
        for (int num : auxiliaryList) {
            System.out.println("Modified auxiliaryList element: " + num);
        }

        /* read */ int value = list.get(0);
        System.out.println("Value from ImmutableList: " + value);

        // Additional complex operations
        ArrayList<Integer> anotherList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            anotherList.add(i * 3);
        }
        for (int i = 0; i < anotherList.size(); i++) {
            System.out.println("Another list element: " + anotherList.get(i));
        }
    }
}