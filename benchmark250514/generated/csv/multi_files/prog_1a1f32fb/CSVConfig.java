import org.apache.commons.csv.CSVFormat;

public class CSVConfig {
    private CSVFormat format;

    public CSVConfig() {
        this.format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ this.format = this.format.withIgnoreHeaderCase();
    }

    public CSVFormat getFormat() {
        return this.format;
    }
}