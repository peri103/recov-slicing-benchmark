import org.apache.commons.csv.CSVFormat;

public class CSVFormatHandler {
    private CSVFormat format;

    public CSVFormatHandler() {
        /* write */ format = CSVFormat.DEFAULT.withIgnoreHeaderCase(true);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
