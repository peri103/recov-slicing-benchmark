import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class CustomLabelGenerator {
    private StandardPieSectionLabelGenerator labelGenerator;

    public CustomLabelGenerator() {
        this.labelGenerator = new StandardPieSectionLabelGenerator();
    }

    public void setCustomNumberFormat(NumberFormat format) {
        /* write */ labelGenerator.setNumberFormat(format);
    }

    public NumberFormat retrieveNumberFormat() {
        return labelGenerator.getNumberFormat();
    }
}