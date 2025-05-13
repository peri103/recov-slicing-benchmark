import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.CompassPlot.Needle;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompassPlot compassPlot = new CompassPlot();
        Needle needle = new Needle(); // Assuming Needle is a valid class or enum in the CompassPlot context

        // Additional complex logic before the write operation
        List<String> directions = new ArrayList<>();
        directions.add("North");
        directions.add("South");
        directions.add("East");
        directions.add("West");

        for (String direction : directions) {
            System.out.println("Direction: " + direction);
        }

        /* write */ compassPlot.setSeriesNeedle(needle);

        // More complex logic after the write operation
        List<Integer> angles = new ArrayList<>();
        angles.add(0);
        angles.add(90);
        angles.add(180);
        angles.add(270);

        for (Integer angle : angles) {
            System.out.println("Angle: " + angle);
        }

        // Even more complex logic
        for (int i = 0; i < directions.size(); i++) {
            System.out.println("Direction with angle: " + directions.get(i) + " - " + angles.get(i));
        }

        /* read */ Needle readNeedle = compassPlot.getSeriesNeedle();
        System.out.println(readNeedle); // Assuming Needle has a valid toString() method

        // Additional unrelated logic
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        for (String color : colors) {
            System.out.println("Color: " + color);
        }
    }
}