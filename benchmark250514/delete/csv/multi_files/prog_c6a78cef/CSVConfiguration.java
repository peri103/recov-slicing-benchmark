import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        // Initialize CSVFormat with trimming enabled
        format = CSVFormat.DEFAULT.withTrim(); // /* write */
    }

    public CSVFormat getFormat() {
        return format;
    }
}
