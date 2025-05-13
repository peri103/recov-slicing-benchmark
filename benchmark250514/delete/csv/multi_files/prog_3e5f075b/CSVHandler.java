import org.apache.commons.csv.CSVFormat;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ format = format.withTrailingDelimiter();
    }

    public CSVFormat getFormat() {
        return format;
    }
}
