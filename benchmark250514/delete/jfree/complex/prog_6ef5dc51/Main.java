import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import javax.swing.JPopupMenu;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        // Create a JPopupMenu object
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add("Option 1");
        popupMenu.add("Option 2");

        // Use the write method to set the popup menu
        /* write */ chartPanel.setPopupMenu(popupMenu);

        // Create a list to hold chart panels
        List<ChartPanel> chartPanels = new ArrayList<>();
        chartPanels.add(chartPanel);

        // Create another ChartPanel with a dummy chart
        JFreeChart dummyChart = new JFreeChart("Dummy Chart", JFreeChart.DEFAULT_TITLE_FONT, new Plot() {}, false);
        ChartPanel anotherChartPanel = new ChartPanel(dummyChart);
        anotherChartPanel.setPreferredSize(new Dimension(400, 300));
        anotherChartPanel.setBackground(Color.LIGHT_GRAY);

        // Add the new chart panel to the list
        chartPanels.add(anotherChartPanel);

        // Perform operations on chart panels
        for (ChartPanel cp : chartPanels) {
            cp.setMouseWheelEnabled(true);
            System.out.println("ChartPanel preferred size: " + cp.getPreferredSize());
        }

        // Retrieve the popup menu from the original chart panel
        /* read */ JPopupMenu retrievedPopupMenu = chartPanel.getPopupMenu();

        // Print out the items in the retrieved popup menu to verify
        for (int i = 0; i < retrievedPopupMenu.getComponentCount(); i++) {
            System.out.println(retrievedPopupMenu.getComponent(i));
        }

        // Create and modify additional objects to increase complexity
        ArrayList<String> options = new ArrayList<>();
        options.add("Option A");
        options.add("Option B");
        options.add("Option C");

        for (String option : options) {
            System.out.println("Available option: " + option);
        }
    }
}