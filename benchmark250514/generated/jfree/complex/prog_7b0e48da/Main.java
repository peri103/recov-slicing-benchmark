import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return null;
            }

            @Override
            public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
                // Implementation not needed for this example
            }
        };

        ArrayList<Color> colorList = new ArrayList<>();
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.BLUE);
        
        // Setting the background paint to a color from the list
        /* write */ plot.setBackgroundPaint(colorList.get(2));

        // Additional operations on the color list
        for (Color color : colorList) {
            System.out.println("Color: " + color);
        }

        // Simulate complex operations
        int sumRedValues = 0;
        for (Color color : colorList) {
            sumRedValues += color.getRed();
        }
        System.out.println("Sum of Red values: " + sumRedValues);

        // Retrieve the background paint
        /* read */ Paint paint = plot.getBackgroundPaint();
        System.out.println("Background Paint: " + paint);

        // More complex operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }
        
        int sumNumbers = 0;
        for (int number : numberList) {
            sumNumbers += number;
        }
        System.out.println("Sum of numbers: " + sumNumbers);

        // Print each number
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Number: " + numberList.get(i));
        }
    }
}