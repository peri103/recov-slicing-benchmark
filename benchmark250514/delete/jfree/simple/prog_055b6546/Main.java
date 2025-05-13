import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        StandardXYToolTipGenerator toolTipGenerator = new StandardXYToolTipGenerator();
        NumberFormat format = NumberFormat.getInstance();
        
        /* write */ toolTipGenerator.setNumberFormat(format);
        /* read */ NumberFormat readFormat = toolTipGenerator.getNumberFormat();
        
        System.out.println(readFormat.equals(format));
    }
}