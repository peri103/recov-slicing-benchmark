import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.needle.MeterNeedle;

public class Main {
    public static void main(String[] args) {
        CompassPlot plot = new CompassPlot();
        MeterNeedle needle = new MeterNeedle();
        
        /* write */ plot.setSeriesNeedle(0, needle);
        /* read */ MeterNeedle readNeedle = plot.getSeriesNeedle(0);
        
        System.out.println(readNeedle.equals(needle));
    }
}