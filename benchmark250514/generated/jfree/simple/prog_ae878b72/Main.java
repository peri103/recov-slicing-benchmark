import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        Stroke stroke = new BasicStroke(2.0f);
        LegendItem legendItem = new LegendItem("Sample Item");
        
        /* write */ legendItem.setLineStroke(stroke);
        /* read */ Stroke retrievedStroke = legendItem.getLineStroke();
        
        System.out.println(retrievedStroke);
    }
}