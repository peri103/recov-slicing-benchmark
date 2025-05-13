import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.needle.MeterNeedle;

public class Main {
    public static void main(String[] args) {
        CompassPlot compassPlot = new CompassPlot();
        MeterNeedle needle = new MeterNeedle();
        
        /* write */ compassPlot.setSeriesNeedle(0, needle);
        /* read */ MeterNeedle readNeedle = compassPlot.getSeriesNeedle(0);
        
        System.out.println(readNeedle.equals(needle)); // Should print true if the read needle is the same as the written needle
    }
}