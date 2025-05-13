import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvData = "# This is a comment\n" +
                         "Name,Age,Location\n" +
                         "John,23,USA\n" +
                         "Jane,30,Canada\n";

        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withCommentMarker('#');
        
        List<String> names = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();
        List<String> locations = new ArrayList<>();
        List<String> comments = new ArrayList<>();

        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                if (record.getComment() != null) {
                    comments.add(record.getComment());
                } else {
                    names.add(record.get(0));
                    ages.add(Integer.parseInt(record.get(1)));
                    locations.add(record.get(2));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Names: " + names);
        System.out.println("Ages: " + ages);
        System.out.println("Locations: " + locations);

        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i) + ", Location: " + locations.get(i));
        }

        if (!comments.isEmpty()) {
            /* read */ String comment = comments.get(0);
            System.out.println("Comment: " + comment);
        }

        // Additional operations to make the program more complex
        int sumOfAges = 0;
        for (int age : ages) {
            sumOfAges += age;
        }
        System.out.println("Sum of Ages: " + sumOfAges);

        int maxAge = Integer.MIN_VALUE;
        for (int age : ages) {
            if (age > maxAge) {
                maxAge = age;
            }
        }
        System.out.println("Max Age: " + maxAge);
    }
}