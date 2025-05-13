import org.jfree.chart.LegendItem;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example");
        /* write */ legendItem.setLinePaint(Color.RED);
        /* read */ Color linePaintColor = (Color) legendItem.getLinePaint();
        System.out.println(linePaintColor);
    }
}