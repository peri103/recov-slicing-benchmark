import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        format = CSVFormat.DEFAULT;
    }

    public void configureNullString(String nullString) {
        /* write */ format = format.withNullString(nullString);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
