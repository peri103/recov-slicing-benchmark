import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        format = CSVFormat.DEFAULT;
    }

    public void configureHeaderComments(String comment) {
        /* write */ format = format.withHeaderComments(comment);
    }

    public CSVFormat getFormat() {
        return format;
    }
}
