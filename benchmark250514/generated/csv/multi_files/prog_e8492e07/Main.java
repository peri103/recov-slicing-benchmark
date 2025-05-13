import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.enrollCourse("Mathematics");
        student.enrollCourse("Science");
        
        StringWriter writer = new StringWriter();
        try {
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            csvPrinter.print("Hello, World");
            csvPrinter.flush();

            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);

            /* read */ String value = record.get(0);
            System.out.println(value);

            System.out.println("First course: " + student.getCourse(0));
            System.out.println("Total length of course names: " + student.getTotalCourseLength());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}