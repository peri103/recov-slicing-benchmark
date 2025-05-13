import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example");
        Font font = new Font("Serif", Font.PLAIN, 12);
        
        /* write */ legendItem.setLabelFont(font);
        
        // Additional code to make the program complex
        Color color = new Color(255, 0, 0);
        legendItem.setFillPaint(color);
        
        PiePlot piePlot = new PiePlot();
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0}: {1} ({2})");
        piePlot.setLabelGenerator(labelGenerator);
        
        legendItem.setLabelPaint(Color.BLUE);
        legendItem.setOutlinePaint(Color.GREEN);
        
        Font anotherFont = new Font("SansSerif", Font.BOLD, 14);
        legendItem.setLabelFont(anotherFont);
        
        // Unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        
        /* read */ Font retrievedFont = legendItem.getLabelFont();
        
        System.out.println("Retrieved Font: " + retrievedFont);
        
        // More unrelated operations
        double calculation = Math.pow(2, 3);
        System.out.println("Calculation Result: " + calculation);
        
        Color currentColor = legendItem.getFillPaint();
        System.out.println("Current Fill Paint: " + currentColor);
    }
}