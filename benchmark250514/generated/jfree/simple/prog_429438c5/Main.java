import org.jfree.chart.LegendItem;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        
        /* write */ legendItem.setLabelPaint(Color.RED);
        
        /* read */ Color labelPaint = (Color) legendItem.getLabelPaint();
        
        System.out.println(labelPaint);
    }
}