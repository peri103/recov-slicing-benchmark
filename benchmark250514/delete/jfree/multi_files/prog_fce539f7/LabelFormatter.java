import org.jfree.chart.labels.StandardXYItemLabelGenerator;

public class LabelFormatter {
    private StandardXYItemLabelGenerator labelGenerator;

    public LabelFormatter() {
        labelGenerator = new StandardXYItemLabelGenerator();
    }

    public void setFormat(String format) {
        /* write */ labelGenerator.setFormatString(format);
    }

    public String getFormat() {
        return labelGenerator.getFormatString();
    }
}
