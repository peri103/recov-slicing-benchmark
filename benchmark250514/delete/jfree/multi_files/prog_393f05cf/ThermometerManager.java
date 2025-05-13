import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;

public class ThermometerManager {
    private ThermometerPlot thermometerPlot;
    
    public ThermometerManager() {
        thermometerPlot = new ThermometerPlot();
    }
    
    public void configureThermometer() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        /* write */ thermometerPlot.setValueFormat(decimalFormat);
    }
    
    public ThermometerPlot getThermometerPlot() {
        return thermometerPlot;
    }
}
