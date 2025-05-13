import org.apache.commons.csv.CSVFormat;

public class CSVFormatWrapper {
    private CSVFormat format;

    public CSVFormatWrapper() {
        /* write */ format = CSVFormat.DEFAULT.withEscape('\\');
    }

    public CSVFormat getFormat() {
        return format;
    }
}
