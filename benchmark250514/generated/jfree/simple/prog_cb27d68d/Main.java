import org.jfree.chart.LegendItem;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Color fillColor = Color.RED;
        
        /* write */ legendItem.setFillPaint(fillColor);
        /* read */ Color readColor = (Color) legendItem.getFillPaint();
        
        System.out.println("Fill Paint Color: " + readColor.toString());
    }
}