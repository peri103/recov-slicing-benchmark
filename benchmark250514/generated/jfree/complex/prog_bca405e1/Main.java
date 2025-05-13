import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Shape shape = new Ellipse2D.Double(0, 0, 10, 10);
        legendItem.setShape(shape);
        legendItem.setOutlineStroke(new BasicStroke(2.0f));
        
        /* write */ legendItem.setLinePaint(Color.RED);

        LegendItem anotherLegendItem = new LegendItem("Another Sample");
        anotherLegendItem.setLinePaint(Color.BLUE);
        anotherLegendItem.setShape(new Ellipse2D.Double(0, 0, 20, 20));
        anotherLegendItem.setOutlineStroke(new BasicStroke(1.0f));
        
        // Perform some unrelated operations
        Color color = (Color) anotherLegendItem.getLinePaint();
        Shape anotherShape = anotherLegendItem.getShape();
        System.out.println("Another Legend Item Line Paint: " + color);
        System.out.println("Another Legend Item Shape: " + anotherShape);

        // More unrelated operations
        Shape legendShape = legendItem.getShape();
        System.out.println("Legend Item Shape: " + legendShape);

        /* read */ Color linePaint = (Color) legendItem.getLinePaint();
        System.out.println("Legend Item Line Paint: " + linePaint);
    }
}