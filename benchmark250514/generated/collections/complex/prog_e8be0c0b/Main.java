import org.apache.commons.collections4.list.TreeList;

public class Main {
    public static void main(String[] args) {
        TreeList<Integer> list = new TreeList<>();
        TreeList<Integer> list2 = new TreeList<>();
        TreeList<String> list3 = new TreeList<>();
        
        // Adding elements to list2 and list3
        list2.add(10);
        list2.add(20);
        list3.add("Hello");
        list3.add("World");
        
        // Performing operations on list2
        int sum = 0;
        for (int i = 0; i < list2.size(); i++) {
            sum += list2.get(i);
        }
        System.out.println("Sum of elements in list2: " + sum);
        
        // Performing operations on list3
        StringBuilder sb = new StringBuilder();
        for (String str : list3) {
            sb.append(str).append(" ");
        }
        System.out.println("Concatenated string from list3: " + sb.toString().trim());
        
        // Original write-read pair
        /* write */ list.add(0, 42);
        
        // Performing additional operations on list
        list.add(1, 100);
        list.add(2, 200);
        
        // Calculate the product of elements in list
        int product = 1;
        for (int i = 0; i < list.size(); i++) {
            product *= list.get(i);
        }
        System.out.println("Product of elements in list: " + product);
        
        // Original read operation
        /* read */ int value = list.get(0);
        System.out.println("Value read from list: " + value);
        
        // Performing more operations on list
        list.add(3, 500);
        list.add(4, 1000);
        
        // Print all elements in list
        System.out.println("All elements in list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}