import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        ArrayList<Color> colorList = new ArrayList<>();
        
        // Adding colors to the list
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.BLUE);
        
        // Setting series line visibility
        /* write */ renderer.setSeriesLinesVisible(0, true);

        // Additional configurations
        renderer.setSeriesPaint(0, colorList.get(0));
        renderer.setSeriesPaint(1, colorList.get(1));
        renderer.setSeriesPaint(2, colorList.get(2));

        // Loop to print color details
        for (int i = 0; i < colorList.size(); i++) {
            Color color = colorList.get(i);
            System.out.println("Color " + i + ": " + color.toString());
        }
        
        // Checking series line visibility
        /* read */ boolean isVisible = renderer.getSeriesLinesVisible(0);
        System.out.println("Series 0 lines visible: " + isVisible);

        // Further manipulation
        for (int i = 0; i < colorList.size(); i++) {
            renderer.setSeriesLinesVisible(i, i % 2 == 0);
            boolean visibility = renderer.getSeriesLinesVisible(i);
            System.out.println("Series " + i + " lines visible: " + visibility);
        }
    }
}