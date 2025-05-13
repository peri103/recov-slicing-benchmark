import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        
        /* write */ piePlot.setLabelPaint(Color.RED);
        
        /* read */ Paint labelPaint = piePlot.getLabelPaint();
        
        System.out.println(labelPaint.toString());
    }
}