import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample");
        Shape rectangle = new Rectangle2D.Double(0, 0, 10, 10);
        Color color = Color.BLUE;
        
        /* write */ legendItem.setShape(rectangle);
        
        // Additional complexity: Setting and getting other properties of LegendItem
        legendItem.setPaint(color);
        legendItem.setLabel("Updated Sample");
        
        // Using another class: PieSectionLabelGenerator
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0}: {1} ({2})");
        String label = labelGenerator.generateSectionLabel(null, null);
        System.out.println("Generated Label: " + label);

        // More operations on LegendItem
        legendItem.setLinePaint(Color.RED);
        legendItem.setOutlinePaint(Color.GREEN);
        
        // Manipulating and accessing LegendItem properties
        Color legendColor = (Color) legendItem.getPaint();
        System.out.println("Legend Color: " + legendColor);
        System.out.println("Legend Label: " + legendItem.getLabel());
        
        /* read */ Shape shape = legendItem.getShape();
        
        System.out.println("Legend Shape: " + shape);
    }
}