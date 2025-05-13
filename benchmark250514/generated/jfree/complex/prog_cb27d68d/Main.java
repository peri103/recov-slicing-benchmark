import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Color fillColor = Color.RED;
        Stroke lineStroke = new BasicStroke(2.0f);
        ArrayList<String> labels = new ArrayList<>();
        
        /* write */ legendItem.setFillPaint(fillColor);
        
        // Additional complex operations
        labels.add("First Label");
        labels.add("Second Label");
        
        for (String label : labels) {
            legendItem.setLineStroke(lineStroke);
            System.out.println("Processing label: " + label);
        }
        
        Stroke readStroke = legendItem.getLineStroke();
        System.out.println("Line Stroke: " + readStroke);
        
        /* read */ Color readColor = (Color) legendItem.getFillPaint();
        
        System.out.println("Fill Paint Color: " + readColor.toString());
        
        // Further operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}