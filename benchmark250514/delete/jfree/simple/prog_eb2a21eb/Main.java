import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        StandardXYToolTipGenerator generator = new StandardXYToolTipGenerator();
        NumberFormat format = NumberFormat.getInstance();
        
        /* write */ generator.setNumberFormat(format);
        
        /* read */ NumberFormat readFormat = generator.getNumberFormat();
        
        System.out.println(readFormat.equals(format)); // Should print 'true' if the readFormat is the same as the format set
    }
}