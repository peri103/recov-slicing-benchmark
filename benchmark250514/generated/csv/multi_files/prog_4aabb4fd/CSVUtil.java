import org.apache.commons.csv.CSVFormat;

public class CSVUtil {
    private CSVFormat format;

    public CSVUtil() {
        format = CSVFormat.DEFAULT;
    }

    public void configureCSVFormat() {
        /* write */ format = format.withHeaderComments("This is a header comment");
    }

    public CSVFormat getFormat() {
        return format;
    }
}
