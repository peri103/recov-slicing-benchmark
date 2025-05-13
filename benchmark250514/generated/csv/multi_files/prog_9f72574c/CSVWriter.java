import org.apache.commons.csv.CSVFormat;

public class CSVWriter {
    private CSVFormat format;

    public CSVWriter() {
        format = CSVFormat.DEFAULT;
    }

    public void configureQuote(char quoteChar) {
        /* write */ format = format.withQuote(quoteChar);
    }

    public CSVFormat getFormat() {
        return format;
    }
}