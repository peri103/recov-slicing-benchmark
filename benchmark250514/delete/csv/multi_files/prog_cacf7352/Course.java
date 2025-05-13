import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class Course {
    private String courseName;
    private CSVHandler csvHandler = new CSVHandler();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addCourseComment(String comment) {
        csvHandler.writeComment(comment);
    }

    public void displayCourseComments() {
        List<CSVRecord> records = csvHandler.parseCSV();
        for (CSVRecord record : records) {
            /* read */ String comment = record.getComment();
            if (comment != null) {
                System.out.println(comment);
            }
        }
    }
}
