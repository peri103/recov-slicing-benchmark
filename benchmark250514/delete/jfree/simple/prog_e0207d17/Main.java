import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        NumberFormat numberFormat = NumberFormat.getInstance();
        /* write */ labelGenerator.setNumberFormat(numberFormat);
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();
        System.out.println(retrievedFormat == numberFormat); // Should print 'true'
    }
}