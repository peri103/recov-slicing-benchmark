import org.apache.commons.csv.CSVFormat;

public class CSVFormatWrapper {
    private CSVFormat format;

    public CSVFormatWrapper() {
        this.format = CSVFormat.DEFAULT;
    }

    public void applyIgnoreHeaderCase() {
        /* write */ this.format = format.withIgnoreHeaderCase();
    }

    public CSVFormat getFormat() {
        return format;
    }
}
