import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize DateAxis and SimpleDateFormat
        DateAxis dateAxis = new DateAxis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Initialize other objects
        ArrayList<String> dateStrings = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        
        // Add some dates to dateStrings
        for (int i = 0; i < 5; i++) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            dateStrings.add(dateFormat.format(calendar.getTime()));
        }
        
        // Use the write method
        /* write */ dateAxis.setDateFormatOverride(dateFormat);

        // Perform operations on dateStrings
        for (String dateStr : dateStrings) {
            System.out.println("Formatted date: " + dateStr);
        }
        
        // Further operations unrelated to DateAxis
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Use the read method to get the date format override
        /* read */ SimpleDateFormat readDateFormat = (SimpleDateFormat) dateAxis.getDateFormatOverride();

        // Print the pattern of the read date format
        System.out.println("Date format pattern: " + readDateFormat.toPattern());

        // More operations unrelated to DateAxis
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 4 == 0) {
                System.out.println("Number divisible by 4: " + numbers.get(i));
            }
        }
    }
}