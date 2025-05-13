import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setOutlinePaint(Color.RED);
        /* read */ Color outlinePaint = (Color) plot.getOutlinePaint();
        System.out.println(outlinePaint);
    }
}