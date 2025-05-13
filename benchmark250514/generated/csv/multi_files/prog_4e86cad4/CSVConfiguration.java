import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        this.format = CSVFormat.DEFAULT;
    }

    public void allowMissingColumnNames() {
        /* write */ format = format.withAllowMissingColumnNames(true);
    }

    public CSVFormat getFormat() {
        return format;
    }
}