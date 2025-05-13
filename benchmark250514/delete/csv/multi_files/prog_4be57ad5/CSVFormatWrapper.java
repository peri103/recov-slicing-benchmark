import org.apache.commons.csv.CSVFormat;

public class CSVFormatWrapper {
    private CSVFormat format;

    public CSVFormatWrapper() {
        this.format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ this.format = this.format.withIgnoreEmptyLines(true);
    }

    public CSVFormat getFormat() {
        return this.format;
    }
}
