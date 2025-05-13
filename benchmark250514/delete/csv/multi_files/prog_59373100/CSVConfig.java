import org.apache.commons.csv.CSVFormat;

public class CSVConfig {
    private CSVFormat format;

    public CSVConfig() {
        // Initialize CSVFormat object
        format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        // Apply write method
        /* write */ format = format.withIgnoreHeaderCase(true);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
