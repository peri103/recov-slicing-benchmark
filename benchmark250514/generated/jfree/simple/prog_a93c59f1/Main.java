import org.jfree.chart.LegendItem;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        
        /* write */ legendItem.setLinePaint(Color.RED);
        
        /* read */ Color linePaint = (Color) legendItem.getLinePaint();
        
        System.out.println(linePaint);
    }
}