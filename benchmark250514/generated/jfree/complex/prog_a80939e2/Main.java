import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateAxis dateAxis = new DateAxis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        List<DateAxis> axisList = new ArrayList<>();
        axisList.add(dateAxis);

        /* write */ dateAxis.setDateFormatOverride(dateFormat);

        // Additional operations with the axisList
        for (DateAxis axis : axisList) {
            System.out.println("Axis label: " + axis.getLabel());
        }

        // Performing some unrelated operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // More operations on axisList
        axisList.add(new DateAxis("Secondary Axis"));
        for (DateAxis axis : axisList) {
            System.out.println("Axis label: " + axis.getLabel());
        }

        /* read */ SimpleDateFormat readFormat = (SimpleDateFormat) dateAxis.getDateFormatOverride();
        System.out.println("Date format: " + readFormat.toPattern());

        // Further unrelated operations
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        for (String str : strings) {
            System.out.println("String: " + str);
        }
    }
}