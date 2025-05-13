import org.apache.commons.csv.CSVFormat;

public class CSVConfig {
    private CSVFormat format;

    public CSVConfig() {
        this.format = CSVFormat.DEFAULT;
    }

    public void configureAllowMissingColumnNames() {
        /* write */ format = format.withAllowMissingColumnNames(true);
    }

    public CSVFormat getFormat() {
        return format;
    }
}