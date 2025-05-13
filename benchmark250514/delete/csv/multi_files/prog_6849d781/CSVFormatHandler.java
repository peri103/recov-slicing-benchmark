import org.apache.commons.csv.CSVFormat;

public class CSVFormatHandler {
    private CSVFormat format;

    public CSVFormatHandler() {
        this.format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ this.format = this.format.withIgnoreEmptyLines(true);
    }

    public CSVFormat getFormat() {
        return this.format;
    }
}
