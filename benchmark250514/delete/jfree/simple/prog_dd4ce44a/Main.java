import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.needle.Needle;
import org.jfree.chart.needle.ArrowNeedle;

public class Main {
    public static void main(String[] args) {
        CompassPlot plot = new CompassPlot();
        Needle needle = new ArrowNeedle();
        
        /* write */ plot.setSeriesNeedle(0, needle);
        /* read */ Needle readNeedle = plot.getSeriesNeedle(0);
        
        System.out.println(readNeedle.equals(needle));
    }
}