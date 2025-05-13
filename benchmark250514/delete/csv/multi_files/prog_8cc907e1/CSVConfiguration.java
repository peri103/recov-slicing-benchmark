import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        /* write */ this.format = CSVFormat.DEFAULT.withAllowMissingColumnNames();
    }

    public CSVFormat getFormat() {
        return format;
    }
}
