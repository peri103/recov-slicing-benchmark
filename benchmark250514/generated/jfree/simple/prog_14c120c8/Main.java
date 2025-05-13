import org.jfree.chart.plot.PolarPlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PolarPlot plot = new PolarPlot();
        /* write */ plot.setAngleGridlinePaint(Color.RED);
        /* read */ Color angleGridlinePaint = (Color) plot.getAngleGridlinePaint();
        System.out.println(angleGridlinePaint);
    }
}