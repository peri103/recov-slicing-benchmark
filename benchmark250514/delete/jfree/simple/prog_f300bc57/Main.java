import org.jfree.chart.plot.WaferMapPlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        WaferMapPlot plot = new WaferMapPlot();
        Color color = Color.RED;
        
        /* write */ plot.setPaint(color);
        /* read */ Color retrievedColor = (Color) plot.getPaint();
        
        System.out.println(retrievedColor);
    }
}