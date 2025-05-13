import org.jfree.chart.plot.Plot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            // Implementing abstract methods with no functionality for the sake of demonstration
            @Override
            public String getPlotType() {
                return null;
            }
        };

        /* write */ plot.setOutlinePaint(Color.RED);
        /* read */ java.awt.Paint outlinePaint = plot.getOutlinePaint();
        System.out.println(outlinePaint);
    }
}