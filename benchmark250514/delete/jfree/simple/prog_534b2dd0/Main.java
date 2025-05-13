import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        NumberFormat format = NumberFormat.getInstance();
        /* write */ labelGenerator.setNumberFormat(format);
        
        /* read */ NumberFormat readFormat = labelGenerator.getNumberFormat();
        System.out.println(readFormat.format(12345.6789));
    }
}