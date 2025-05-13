import org.jfree.chart.plot.ThermometerPlot;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot thermometerPlot = new ThermometerPlot();
        /* write */ thermometerPlot.setUnits(ThermometerPlot.UNITS_CELSIUS);
        /* read */ int units = thermometerPlot.getUnits();
        System.out.println(units); // This should print the value corresponding to UNITS_CELSIUS
    }
}