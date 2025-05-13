import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat csvFormat;

    public CSVConfiguration() {
        csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreSurroundingSpaces();
    }

    public CSVFormat getCsvFormat() {
        return csvFormat;
    }
}
