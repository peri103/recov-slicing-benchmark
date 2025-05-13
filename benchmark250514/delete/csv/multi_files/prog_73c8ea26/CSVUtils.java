import org.apache.commons.csv.CSVFormat;
import java.io.StringWriter;
import java.io.IOException;

public class CSVUtils {
    private CSVFormat format;
    private StringWriter writer;

    public CSVUtils() {
        this.writer = new StringWriter();
        this.format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ this.format = this.format.withAutoFlush(true);
    }

    public void writeData(String data) throws IOException {
        writer.append(data);
        writer.flush();
    }

    public String getWrittenData() {
        return writer.toString();
    }

    public CSVFormat getFormat() {
        return format;
    }
}
