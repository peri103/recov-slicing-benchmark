import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };
        
        /* write */ plot.setOutlinePaint(Color.BLUE);
        /* read */ Paint outlinePaint = plot.getOutlinePaint();
        
        System.out.println(outlinePaint);
    }
}