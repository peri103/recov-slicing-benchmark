import org.jfree.chart.plot.Plot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
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