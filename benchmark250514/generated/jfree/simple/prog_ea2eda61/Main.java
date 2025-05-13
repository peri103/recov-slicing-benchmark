import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setLabelPaint(Color.RED);
        /* read */ Paint labelPaint = plot.getLabelPaint();
        System.out.println(labelPaint);
    }
}