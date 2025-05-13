import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class StudentRecords {
    private StringWriter writer = new StringWriter();
    private CSVFormat format = CSVFormat.DEFAULT;

    public StudentRecords() {
        /* write */ format = format.withHeader("Name", "Age", "City");
    }

    public void addStudentRecord(Student student) {
        try {
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord(student.getName(), student.getAge(), student.getCity());
            printer.flush();
            printer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCsvContent() {
        return writer.toString();
    }
}
