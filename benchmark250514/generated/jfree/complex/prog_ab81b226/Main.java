import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize DateAxis and SimpleDateFormat
        DateAxis dateAxis = new DateAxis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Initialize a list to store patterns
        List<String> patternList = new ArrayList<>();

        // Add some patterns to the list
        patternList.add("MM/dd/yyyy");
        patternList.add("dd-MM-yyyy");
        patternList.add("yyyy/MM/dd");

        // Set the date format override
        /* write */ dateAxis.setDateFormatOverride(dateFormat);

        // Perform some operations on the pattern list
        for (String pattern : patternList) {
            SimpleDateFormat tempFormat = new SimpleDateFormat(pattern);
            System.out.println("Pattern: " + tempFormat.toPattern());
        }

        // Read the date format override
        /* read */ SimpleDateFormat readDateFormat = (SimpleDateFormat) dateAxis.getDateFormatOverride();

        // Print the pattern of the read date format
        System.out.println("Read Pattern: " + readDateFormat.toPattern());

        // Additional operations to make the program complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Modify the patternList for further complexity
        patternList.add("MMM dd, yyyy");
        patternList.add("EEEE, MMMM dd, yyyy");

        for (String pattern : patternList) {
            SimpleDateFormat tempFormat = new SimpleDateFormat(pattern);
            System.out.println("Modified Pattern: " + tempFormat.toPattern());
        }
    }
}