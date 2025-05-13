import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Paint paint = new Color(255, 0, 0); // Red color
        /* write */ plot.setLabelOutlinePaint(paint);
        /* read */ Paint readPaint = plot.getLabelOutlinePaint();
        System.out.println(readPaint);
    }
}