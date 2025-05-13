import org.jfree.chart.plot.PolarPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PolarPlot plot = new PolarPlot();
        
        /* write */ plot.setAngleGridlinePaint(Color.RED);
        
        /* read */ Paint paint = plot.getAngleGridlinePaint();
        
        System.out.println(paint);
    }
}