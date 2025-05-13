import org.jfree.chart.plot.PiePlot;
import java.awt.Stroke;

public class StrokeRetriever {
    private PiePlot plot;

    public StrokeRetriever(PiePlot plot) {
        this.plot = plot;
    }

    public Stroke getStrokeForSection(String section) {
        /* read */ return plot.getSectionOutlineStroke(section);
    }
}
