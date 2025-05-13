import org.apache.commons.csv.CSVFormat;

public class CSVConfig {
    private CSVFormat format;

    public CSVConfig() {
        /* write */ format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
    }

    public CSVFormat getFormat() {
        return format;
    }
}
