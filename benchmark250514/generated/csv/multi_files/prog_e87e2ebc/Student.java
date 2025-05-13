import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.csv.CSVRecord;

public class Student {
    private String name;
    private int age;
    private static Map<String, Integer> nameAgeMap = new HashMap<>();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        nameAgeMap.put(name, age);
    }

    public static void calculateAverageAge() {
        int totalAge = 0;
        for (int age : nameAgeMap.values()) {
            totalAge += age;
        }
        double averageAge = totalAge / (double) nameAgeMap.size();
        System.out.println("Average Age: " + averageAge);
    }

    public static void printNames() {
        System.out.println("Names:");
        for (String name : nameAgeMap.keySet()) {
            System.out.println(name);
        }
    }

    public static boolean checkIsMapped(List<CSVRecord> records) {
        // Read the first record using the read method
        CSVRecord record = records.get(0);
        /* read */ return record.isMapped("name");
    }
}
