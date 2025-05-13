import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Paint labelPaint = new Color(255, 0, 0); // Red color
        /* write */ plot.setLabelPaint(labelPaint);
        /* read */ Paint readLabelPaint = plot.getLabelPaint();
        System.out.println(readLabelPaint);
    }
}