import org.jfree.chart.plot.FastScatterPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        FastScatterPlot plot = new FastScatterPlot();

        /* write */ plot.setDomainGridlinePaint(Color.RED);
        /* read */ Paint paint = plot.getDomainGridlinePaint();

        System.out.println(paint);
    }
}