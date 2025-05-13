import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        /* write */ piePlot.setLabelOutlinePaint(Color.RED);
        /* read */ Paint paint = piePlot.getLabelOutlinePaint();
        System.out.println(paint);
    }
}