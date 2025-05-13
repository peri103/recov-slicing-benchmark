import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        
        /* write */ plot.setLabelPaint(Color.RED);
        
        /* read */ Color labelPaint = (Color) plot.getLabelPaint();
        
        System.out.println(labelPaint);
    }
}