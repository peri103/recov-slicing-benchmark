import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setLabelOutlinePaint(Color.RED);
        /* read */ Color color = (Color) plot.getLabelOutlinePaint();
        System.out.println(color);
    }
}