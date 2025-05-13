import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        format = CSVFormat.DEFAULT;
    }

    public void configure() {
        /* write */ format = format.withAllowMissingColumnNames(true);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
