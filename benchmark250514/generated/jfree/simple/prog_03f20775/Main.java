import org.jfree.chart.plot.PolarPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PolarPlot polarPlot = new PolarPlot();
        
        /* write */ polarPlot.setAngleGridlinePaint(Color.RED);
        
        /* read */ Paint angleGridlinePaint = polarPlot.getAngleGridlinePaint();
        
        System.out.println(angleGridlinePaint);
    }
}