import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample");
        /* write */ legendItem.setLinePaint(Color.RED);
        /* read */ Paint paint = legendItem.getLinePaint();
        System.out.println(paint);
    }
}