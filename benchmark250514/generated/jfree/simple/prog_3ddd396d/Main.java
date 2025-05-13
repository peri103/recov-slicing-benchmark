import org.jfree.chart.plot.XYPlot;
import java.awt.Paint;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        Paint paint = Color.RED;
        /* write */ plot.setDomainGridlinePaint(paint);
        /* read */ Paint retrievedPaint = plot.getDomainGridlinePaint();
        System.out.println(retrievedPaint);
    }
}