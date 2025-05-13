import org.jfree.chart.plot.Plot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };
        Color outlineColor = Color.RED;
        /* write */ plot.setOutlinePaint(outlineColor);
        /* read */ Color readColor = (Color) plot.getOutlinePaint();
        System.out.println(readColor);
    }
}