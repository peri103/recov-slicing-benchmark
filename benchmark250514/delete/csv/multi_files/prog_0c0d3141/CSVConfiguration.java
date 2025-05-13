import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        // Initialize CSVFormat with default settings
        format = CSVFormat.DEFAULT;
    }

    public void enableDuplicateHeaders() {
        // Use the write method to allow duplicate header names
        /* write */ format = format.withAllowDuplicateHeaderNames(true);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
