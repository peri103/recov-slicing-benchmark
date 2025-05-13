import org.jfree.chart.plot.PiePlot;
import java.awt.Paint;

public class PaintDisplay {
    private PiePlot plot;

    public PaintDisplay(PiePlot plot) {
        this.plot = plot;
    }

    public void displayLabelBackgroundPaint() {
        /* read */ Paint paint = plot.getLabelBackgroundPaint();
        System.out.println("Label Background Paint: " + paint);
    }
}