import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot thermometerPlot = new ThermometerPlot();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        /* write */ thermometerPlot.setValueFormat(decimalFormat);
        
        /* read */ DecimalFormat readFormat = (DecimalFormat) thermometerPlot.getValueFormat();
        
        System.out.println(readFormat.toPattern());
    }
}