import org.jfree.chart.LegendItem;
import java.awt.Stroke;

public class LegendAnalyzer {
    private LegendItem legendItem;

    public LegendAnalyzer(LegendItem legendItem) {
        this.legendItem = legendItem;
    }

    public void analyze() {
        /* read */ Stroke readStroke = legendItem.getLineStroke();
        System.out.println("Analyzed Stroke: " + readStroke);
    }
}
