import org.apache.commons.collections4.list.TreeList;

public class Main {
    public static void main(String[] args) {
        TreeList<Integer> list = new TreeList<>();
        TreeList<Integer> auxiliaryList = new TreeList<>();
        
        // Adding elements to the auxiliary list
        for (int i = 0; i < 5; i++) {
            auxiliaryList.add(i * 10); // Adding multiples of 10
        }
        
        // Processing auxiliary list
        int sum = 0;
        for (int i = 0; i < auxiliaryList.size(); i++) {
            sum += auxiliaryList.get(i); // Summing up the elements
        }
        
        // Output the sum
        System.out.println("Sum of auxiliary list: " + sum);
        
        /* write */ list.add(0, 42); // Adding the value 42 at index 0
        
        // Further processing
        for (int i = 0; i < auxiliaryList.size(); i++) {
            list.add(auxiliaryList.get(i)); // Adding all elements from auxiliary list to main list
        }
        
        // Performing a complex calculation
        int product = 1;
        for (int i = 0; i < list.size(); i++) {
            product *= list.get(i); // Calculating the product of all elements
        }
        
        // Output the product
        System.out.println("Product of list elements: " + product);
        
        /* read */ int value = list.get(0); // Retrieving the value at index 0
        System.out.println("Read value: " + value); // Output the read value
        
        // Output all elements in the list
        System.out.println("All elements in the list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}