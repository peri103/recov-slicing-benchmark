import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setLabelOutlinePaint(Color.RED);
        /* read */ Paint paint = plot.getLabelOutlinePaint();
        System.out.println(paint);
    }
}