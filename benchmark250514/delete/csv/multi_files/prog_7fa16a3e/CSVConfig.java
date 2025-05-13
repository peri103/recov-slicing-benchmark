import org.apache.commons.csv.CSVFormat;

public class CSVConfig {
    private CSVFormat format;

    public CSVConfig() {
        format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ format = format.withIgnoreHeaderCase();
    }

    public CSVFormat getFormat() {
        return format;
    }
}
