import org.apache.commons.csv.CSVFormat;

public class CSVUtils {
    private CSVFormat format;

    public CSVUtils() {
        /* write */ this.format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");
    }

    public CSVFormat getFormat() {
        return format;
    }
}
