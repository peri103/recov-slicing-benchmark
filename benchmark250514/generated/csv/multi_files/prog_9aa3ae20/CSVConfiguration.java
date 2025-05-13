import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        this.format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ this.format = format.withIgnoreEmptyLines(true);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
