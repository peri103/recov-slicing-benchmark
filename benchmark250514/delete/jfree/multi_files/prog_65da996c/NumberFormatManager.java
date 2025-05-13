import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;

public class NumberFormatManager {
    private StandardXYToolTipGenerator generator;

    public NumberFormatManager() {
        generator = new StandardXYToolTipGenerator();
    }

    public void setFormat(NumberFormat format) {
        /* write */ generator.setNumberFormat(format);
    }

    public NumberFormat getFormat() {
        return generator.getNumberFormat();
    }
}
