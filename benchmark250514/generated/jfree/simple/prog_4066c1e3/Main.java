import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setBackgroundPaint(Color.RED);
        /* read */ Color backgroundPaint = (Color) plot.getBackgroundPaint();
        System.out.println(backgroundPaint);
    }
}