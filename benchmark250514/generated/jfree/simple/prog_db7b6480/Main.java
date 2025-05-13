import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        /* write */ plot.setRangeGridlinePaint(Color.BLUE);
        /* read */ Paint paint = plot.getRangeGridlinePaint();
        System.out.println(paint);
    }
}