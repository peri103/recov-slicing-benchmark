import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        this.format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ format = format.withTrim();
    }

    public CSVFormat getFormat() {
        return format;
    }
}
