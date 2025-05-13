import org.jfree.chart.labels.StandardXYItemLabelGenerator;

public class LabelGeneratorWrapper {
    private StandardXYItemLabelGenerator labelGenerator;

    public LabelGeneratorWrapper() {
        labelGenerator = new StandardXYItemLabelGenerator();
    }

    public void setFormatString(String format) {
        /* write */ labelGenerator.setFormatString(format);
    }

    public String getFormatString() {
        return labelGenerator.getFormatString();
    }
}
