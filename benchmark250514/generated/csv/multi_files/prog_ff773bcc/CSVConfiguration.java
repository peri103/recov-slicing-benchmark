import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        this.format = CSVFormat.DEFAULT;
    }

    public void configureNullString(String nullString) {
        /* write */ this.format = this.format.withNullString(nullString);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
