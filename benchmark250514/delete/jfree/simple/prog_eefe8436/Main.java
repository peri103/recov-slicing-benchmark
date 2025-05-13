import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        StandardPieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator();
        NumberFormat format = NumberFormat.getCurrencyInstance();
        
        /* write */ generator.setNumberFormat(format);
        
        /* read */ NumberFormat readFormat = generator.getNumberFormat();
        
        System.out.println(readFormat.format(12345.67));
    }
}