import org.apache.commons.csv.CSVFormat;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void enableAutoFlush() {
        /* write */ format = format.withAutoFlush(true);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
