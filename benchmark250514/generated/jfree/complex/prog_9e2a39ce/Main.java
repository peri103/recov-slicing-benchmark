import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DateAxis dateAxis = new DateAxis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        ArrayList<String> datePatterns = new ArrayList<>();
        datePatterns.add("dd-MM-yyyy");
        datePatterns.add("MM/dd/yyyy");
        datePatterns.add("yyyy.MM.dd");
        
        for (String pattern : datePatterns) {
            SimpleDateFormat tempFormat = new SimpleDateFormat(pattern);
            System.out.println("Temporary format: " + tempFormat.toPattern());
        }
        
        /* write */ dateAxis.setDateFormatOverride(dateFormat);
        
        // Additional unrelated code to increase complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        // More operations on numbers
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 5);
        }
        
        System.out.println("Modified numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
        
        /* read */ SimpleDateFormat readFormat = (SimpleDateFormat) dateAxis.getDateFormatOverride();
        
        System.out.println("Read format: " + readFormat.toPattern());
    }
}