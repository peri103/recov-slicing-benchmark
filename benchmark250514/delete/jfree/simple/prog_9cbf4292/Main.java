import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getInstance();
        StandardXYToolTipGenerator generator = new StandardXYToolTipGenerator();
        
        /* write */ generator.setNumberFormat(format);
        
        /* read */ NumberFormat readFormat = generator.getNumberFormat();
        
        System.out.println("NumberFormat set: " + (readFormat == format));
    }
}