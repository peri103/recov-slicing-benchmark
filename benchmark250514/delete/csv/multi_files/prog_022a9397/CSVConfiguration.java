import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat csvFormat;

    public CSVConfiguration() {
        csvFormat = CSVFormat.DEFAULT;
    }

    public void configureCommentMarker(char commentMarker) {
        /* write */ csvFormat = csvFormat.withCommentMarker(commentMarker);
    }

    public CSVFormat getCsvFormat() {
        return csvFormat;
    }
}
