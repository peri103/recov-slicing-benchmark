import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        DecimalFormat format = new DecimalFormat("#.##");
        
        /* write */ plot.setValueFormat(format);
        /* read */ DecimalFormat retrievedFormat = (DecimalFormat) plot.getValueFormat();
        
        System.out.println("Value Format: " + retrievedFormat.toPattern());
    }
}