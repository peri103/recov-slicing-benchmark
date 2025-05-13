import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat csvFormat;

    public CSVConfiguration() {
        csvFormat = CSVFormat.DEFAULT;
    }

    public void enableTrimming() {
        /* write */ csvFormat = csvFormat.withTrim();
    }

    public CSVFormat getCsvFormat() {
        return csvFormat;
    }
}
