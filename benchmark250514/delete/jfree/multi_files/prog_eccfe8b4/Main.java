import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        ChartManager chartManager = new ChartManager();
        Stroke stroke = new BasicStroke(2.0f);
        chartManager.setSectionOutlineStroke("Section1", stroke);

        // Perform some unrelated calculations
        double total = 0.0;
        for (int i = 1; i <= 10; i++) {
            total += Math.sqrt(i);
        }
        System.out.println("Total of square roots: " + total);

        // Print section colors
        chartManager.printSectionColors();

        /* read */ Stroke retrievedStroke = chartManager.getSectionOutlineStroke("Section1");
        System.out.println("Retrieved Stroke: " + retrievedStroke);

        // Additional unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
    }
}