import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Paint paint = Color.BLUE;

        /* write */ plot.setLabelBackgroundPaint(paint);
        /* read */ Paint readPaint = plot.getLabelBackgroundPaint();

        System.out.println(readPaint);
    }
}