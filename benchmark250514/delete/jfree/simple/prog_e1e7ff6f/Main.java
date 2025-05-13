import org.jfree.chart.plot.ThermometerPlot;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        /* write */ plot.setUnits(ThermometerPlot.UNITS_CELSIUS);
        /* read */ int units = plot.getUnits();
        System.out.println("Units set in ThermometerPlot: " + units);
    }
}