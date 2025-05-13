import org.apache.commons.csv.CSVFormat;

public class CSVUtils {
    private CSVFormat format;

    public CSVUtils() {
        format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ format = format.withNullString("NULL");
    }

    public CSVFormat getFormat() {
        return format;
    }
}
