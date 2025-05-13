import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat csvFormat = CSVFormat.DEFAULT;

    public void configure() {
        /* write */ csvFormat = csvFormat.withAllowDuplicateHeaderNames(true);
    }

    public CSVFormat getCsvFormat() {
        return csvFormat;
    }
}
