import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        
        // Create a DecimalFormat instance to set the value format
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        /* write */ plot.setValueFormat(decimalFormat);
        
        /* read */ DecimalFormat retrievedFormat = (DecimalFormat) plot.getValueFormat();
        
        System.out.println("Value format pattern: " + retrievedFormat.toPattern());
    }
}