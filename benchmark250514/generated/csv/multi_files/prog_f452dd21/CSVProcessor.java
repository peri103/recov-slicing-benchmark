import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVProcessor {
    private CSVConfig csvConfig;

    public CSVProcessor(CSVConfig csvConfig) {
        this.csvConfig = csvConfig;
    }

    public List<Student> parseCSV(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), csvConfig.getFormat());
        List<Student> students = new ArrayList<>();

        for (CSVRecord record : parser) {
            String name = record.get(0).trim();
            int age = Integer.parseInt(record.get(1).trim());
            Student student = new Student(name);
            student.addAge(age);
            students.add(student);

            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Record is consistent: " + isConsistent);
        }

        return students;
    }
}
