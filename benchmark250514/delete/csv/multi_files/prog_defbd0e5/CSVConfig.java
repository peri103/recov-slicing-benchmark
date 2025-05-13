import org.apache.commons.csv.CSVFormat;

public class CSVConfig {
    private CSVFormat format;

    public CSVConfig() {
        format = CSVFormat.DEFAULT;
    }

    public void enableTrim() {
        /* write */ format = format.withTrim();
    }

    public CSVFormat getFormat() {
        return format;
    }
}
