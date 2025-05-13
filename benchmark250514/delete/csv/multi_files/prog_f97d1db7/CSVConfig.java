import org.apache.commons.csv.CSVFormat;

public class CSVConfig {
    private CSVFormat csvFormat;

    public CSVConfig() {
        csvFormat = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ csvFormat = csvFormat.withAllowMissingColumnNames(true);
    }

    public CSVFormat getCsvFormat() {
        return csvFormat;
    }
}
