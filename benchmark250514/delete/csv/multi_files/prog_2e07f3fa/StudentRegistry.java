import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentRegistry {
    private List<Student> students = new ArrayList<>();
    private StringWriter writer = new StringWriter();
    private CSVPrinter csvPrinter;

    public StudentRegistry() throws IOException {
        csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
    }

    public void addStudent(Student student) {
        students.add(student);
        try {
            /* write */ csvPrinter.printRecord(student.getFirstName(), student.getLastName(), student.getAge());
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCSVData() {
        return writer.toString();
    }
}
