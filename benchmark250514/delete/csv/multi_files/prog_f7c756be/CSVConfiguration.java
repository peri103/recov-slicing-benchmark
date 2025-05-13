import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        this.format = CSVFormat.DEFAULT;
    }

    public void allowDuplicateHeaders() {
        /* write */ format = format.withAllowDuplicateHeaderNames(true);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
