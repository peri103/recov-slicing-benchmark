import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getInstance();
        StandardXYToolTipGenerator generator = new StandardXYToolTipGenerator();
        
        /* write */ generator.setNumberFormat(format);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        HashMap<Integer, String> numberDescriptions = new HashMap<>();
        for (int num : numbers) {
            numberDescriptions.put(num, "Number: " + num);
        }
        
        System.out.println("Descriptions of even numbers:");
        for (Integer key : numberDescriptions.keySet()) {
            System.out.println(numberDescriptions.get(key));
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        /* read */ NumberFormat readFormat = generator.getNumberFormat();
        
        System.out.println("NumberFormat set: " + (readFormat == format));
        
        ArrayList<String> formattedNumbers = new ArrayList<>();
        for (int num : numbers) {
            formattedNumbers.add(readFormat.format(num));
        }
        
        System.out.println("Formatted numbers:");
        for (String formattedNumber : formattedNumbers) {
            System.out.println(formattedNumber);
        }
    }
}