import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Part 1: CSVFormat and CSVRecord operations
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withTrailingDelimiter();

        String[] values = {"value1", "value2", "value3"};
        CSVRecord csvRecord = new CSVRecord(null, null, values, null, null);

        // Some unrelated complex operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 5);
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // More complex operations
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("!");

        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str).append(" ");
        }
        System.out.println(sb.toString().trim());

        // Part 2: CSVRecord read operation
        /* read */ boolean isSet = csvRecord.isSet(1);
        System.out.println("Is index 1 set in CSVRecord: " + isSet);

        // Additional operations
        List<Double> decimals = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            decimals.add(i * 1.5);
        }

        double product = 1;
        for (Double decimal : decimals) {
            product *= decimal;
        }
        System.out.println("Product of decimals: " + product);
    }
}