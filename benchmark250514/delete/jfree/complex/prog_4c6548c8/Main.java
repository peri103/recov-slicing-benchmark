import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        StandardPieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator();
        NumberFormat format = NumberFormat.getInstance();
        /* write */ generator.setNumberFormat(format);

        // Additional complex code
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
            map.put("Key" + i, i);
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        if (map.containsKey("Key5")) {
            System.out.println("Value for Key5: " + map.get("Key5"));
        }

        // More unrelated operations
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 1);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // Original read operation
        /* read */ NumberFormat readFormat = generator.getNumberFormat();
        System.out.println(readFormat.equals(format)); // Should print true
    }
}