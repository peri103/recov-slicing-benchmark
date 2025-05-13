import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateAxis dateAxis = new DateAxis();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        /* write */ dateAxis.setDateFormatOverride(dateFormat);
        
        // Additional code to make the program more complex
        List<String> datePatterns = new ArrayList<>();
        datePatterns.add("MM-dd-yyyy");
        datePatterns.add("dd-MM-yyyy");
        datePatterns.add("yyyy/MM/dd");

        SimpleDateFormat anotherFormat = new SimpleDateFormat(datePatterns.get(0));
        DateAxis anotherDateAxis = new DateAxis();
        anotherDateAxis.setDateFormatOverride(anotherFormat);

        for (String pattern : datePatterns) {
            SimpleDateFormat tempFormat = new SimpleDateFormat(pattern);
            anotherDateAxis.setDateFormatOverride(tempFormat);
            System.out.println("Set pattern: " + tempFormat.toPattern());
        }

        // Simulating some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }

        /* read */ SimpleDateFormat retrievedFormat = (SimpleDateFormat) dateAxis.getDateFormatOverride();
        
        System.out.println("Retrieved pattern: " + retrievedFormat.toPattern());
    }
}