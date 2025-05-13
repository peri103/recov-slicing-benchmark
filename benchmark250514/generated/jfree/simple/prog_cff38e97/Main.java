import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        
        /* write */ piePlot.setLabelBackgroundPaint(Color.RED);
        
        /* read */ Paint labelBackgroundPaint = piePlot.getLabelBackgroundPaint();
        
        System.out.println(labelBackgroundPaint);
    }
}