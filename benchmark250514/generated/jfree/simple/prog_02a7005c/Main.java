import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        /* write */ plot.setDomainGridlinePaint(Color.RED);
        /* read */ Paint paint = plot.getDomainGridlinePaint();
        System.out.println(paint);
    }
}