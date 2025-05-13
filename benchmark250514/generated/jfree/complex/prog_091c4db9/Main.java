import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample");
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        /* write */ legendItem.setLabelFont(font);
        
        // Additional code to add complexity
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        
        LegendItem anotherLegendItem = new LegendItem("Another Sample");
        Font anotherFont = new Font("Times New Roman", Font.BOLD, 14);
        anotherLegendItem.setLabelFont(anotherFont);
        legendItems.add(anotherLegendItem);
        
        Color color = new Color(255, 0, 0);
        legendItem.setFillPaint(color);
        
        for (LegendItem item : legendItems) {
            Font itemFont = item.getLabelFont();
            System.out.println("Legend Item: " + item.getLabel());
            System.out.println("Font Name: " + itemFont.getName());
            System.out.println("Font Style: " + itemFont.getStyle());
            System.out.println("Font Size: " + itemFont.getSize());
            System.out.println("Color: " + ((Color) item.getFillPaint()).toString());
        }
        
        // Performing some unrelated calculations
        int a = 5;
        int b = 10;
        int result = a * b;
        System.out.println("Calculation result: " + result);
        
        // More operations on legendItems
        for (LegendItem item : legendItems) {
            item.setFillPaint(Color.BLUE);
        }
        
        /* read */ Font readFont = legendItem.getLabelFont();
        System.out.println("Read Font Name: " + readFont.getName());
        System.out.println("Read Font Style: " + readFont.getStyle());
        System.out.println("Read Font Size: " + readFont.getSize());
    }
}