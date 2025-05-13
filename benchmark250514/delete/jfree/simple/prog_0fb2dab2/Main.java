import org.jfree.chart.plot.WaferMapPlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        WaferMapPlot plot = new WaferMapPlot();
        Color paintColor = Color.RED;

        /* write */ plot.setPaint(paintColor);
        /* read */ Color retrievedColor = (Color) plot.getPaint();

        System.out.println(retrievedColor);
    }
}