import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;

public class TemperatureDisplay {
    private ThermometerPlot thermometerPlot;
    
    public TemperatureDisplay(ThermometerPlot thermometerPlot) {
        this.thermometerPlot = thermometerPlot;
    }
    
    public void displayTemperatureFormat() {
        /* read */ DecimalFormat readFormat = (DecimalFormat) thermometerPlot.getValueFormat();
        System.out.println("Thermometer Value Format: " + readFormat.toPattern());
    }
}
