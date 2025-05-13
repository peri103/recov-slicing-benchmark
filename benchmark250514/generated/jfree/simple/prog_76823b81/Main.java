import org.jfree.chart.plot.XYPlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        /* write */ plot.setDomainGridlinePaint(Color.RED);
        /* read */ Color paint = (Color) plot.getDomainGridlinePaint();
        System.out.println(paint);
    }
}