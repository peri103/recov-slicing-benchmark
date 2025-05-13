import org.apache.commons.csv.CSVFormat;

public class CSVConfiguration {
    private CSVFormat format;

    public CSVConfiguration() {
        this.format = CSVFormat.DEFAULT;
    }

    public void setEscapeCharacter(char escapeChar) {
        this.format = format.withEscape(escapeChar); /* write */
    }

    public CSVFormat getFormat() {
        return format;
    }
}
