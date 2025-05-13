import org.apache.commons.csv.CSVFormat;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void addHeaderComment(String comment) {
        /* write */ format = format.withHeaderComments(comment);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
