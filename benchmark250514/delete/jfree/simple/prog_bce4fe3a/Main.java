import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        NumberFormat format = NumberFormat.getInstance();
        
        /* write */ labelGenerator.setNumberFormat(format);
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();
        
        System.out.println(retrievedFormat.equals(format));
    }
}