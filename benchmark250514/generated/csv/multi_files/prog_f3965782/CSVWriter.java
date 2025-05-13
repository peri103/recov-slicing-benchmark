import org.apache.commons.csv.CSVFormat;

public class CSVWriter {
    private CSVFormat format;

    public CSVWriter() {
        format = CSVFormat.DEFAULT;
    }

    public void addHeaderComment(String comment) {
        /* write */ format = format.withHeaderComments(comment);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
