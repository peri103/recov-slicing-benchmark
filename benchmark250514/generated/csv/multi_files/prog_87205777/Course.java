import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students = new ArrayList<>();
    private StringWriter writer = new StringWriter();
    private CSVPrinter csvPrinter;

    public Course(String courseName) {
        this.courseName = courseName;
        try {
            this.csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public List<Student> getStudents() {
        return students;
    }
}
