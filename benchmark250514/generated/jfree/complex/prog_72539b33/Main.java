import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MeterPlot meterPlot = new MeterPlot();
        MeterPlot anotherMeterPlot = new MeterPlot();
        ArrayList<Plot> plots = new ArrayList<>();
        HashMap<String, Paint> paintMap = new HashMap<>();

        // Set up another meter plot
        anotherMeterPlot.setDialBackgroundPaint(Color.RED);
        plots.add(anotherMeterPlot);

        // Add to list of plots
        plots.add(meterPlot);

        // Set up paint map
        paintMap.put("blue", Color.BLUE);
        paintMap.put("red", Color.RED);

        // Use the paint map for setting background paint
        Paint selectedPaint = paintMap.get("blue");

        /* write */ meterPlot.setDialBackgroundPaint(selectedPaint);

        // Perform some operations on plots
        for (Plot plot : plots) {
            System.out.println("Plot class: " + plot.getClass().getSimpleName());
        }

        // Retrieve and print the paint from the meter plot
        /* read */ Paint paint = meterPlot.getDialBackgroundPaint();
        System.out.println("Dial Background Paint: " + paint);

        // Use another paint from the map
        Paint anotherSelectedPaint = paintMap.get("red");
        anotherMeterPlot.setDialBackgroundPaint(anotherSelectedPaint);

        // Print final states
        for (Plot plot : plots) {
            if (plot instanceof MeterPlot) {
                Paint currentPaint = ((MeterPlot) plot).getDialBackgroundPaint();
                System.out.println("Current Dial Background Paint: " + currentPaint);
            }
        }
    }
}