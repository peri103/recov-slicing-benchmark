import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.dial.DialNeedle;

public class Main {
    public static void main(String[] args) {
        CompassPlot compassPlot = new CompassPlot();
        DialNeedle needle = new DialNeedle();
        
        /* write */ compassPlot.setSeriesNeedle(0, needle);
        /* read */ DialNeedle readNeedle = compassPlot.getSeriesNeedle(0);
        
        System.out.println(readNeedle.equals(needle));
    }
}