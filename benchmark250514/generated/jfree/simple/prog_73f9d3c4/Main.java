import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        
        /* write */ plot.setRangeGridlinePaint(Color.RED);
        
        /* read */ Paint gridlinePaint = plot.getRangeGridlinePaint();
        
        System.out.println(gridlinePaint);
    }
}