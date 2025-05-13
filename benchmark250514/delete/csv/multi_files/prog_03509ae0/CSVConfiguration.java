import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat csvFormat;

    public CSVConfiguration() {
        this.csvFormat = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();
    }

    public CSVFormat getCsvFormat() {
        return csvFormat;
    }
}
