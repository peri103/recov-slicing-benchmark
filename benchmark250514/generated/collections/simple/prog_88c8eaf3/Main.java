import org.apache.commons.collections4.list.TreeList;

public class Main {
    public static void main(String[] args) {
        TreeList<Integer> list = new TreeList<>();
        /* write */ list.add(0, 42); // Adding the value 42 at index 0
        /* read */ int value = list.get(0); // Retrieving the value at index 0
        System.out.println(value); // Output the value
    }
}