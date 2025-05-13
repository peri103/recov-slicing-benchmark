import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import javax.swing.JPopupMenu;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the ChartPanel with a null chart
        ChartPanel chartPanel = new ChartPanel(null);

        // Initialize a JPopupMenu and add items
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add("Option 1");
        popupMenu.add("Option 2");

        // Set the popup menu using the write method
        /* write */ chartPanel.setPopupMenu(popupMenu);

        // Additional complexity: set background and preferred size
        chartPanel.setBackground(Color.WHITE);
        chartPanel.setPreferredSize(new Dimension(800, 600));

        // Create another ChartPanel with a mock chart
        JFreeChart mockChart = new JFreeChart("Mock Chart", JFreeChart.DEFAULT_TITLE_FONT, null, false);
        ChartPanel anotherChartPanel = new ChartPanel(mockChart);

        // Set a different popup menu for the other ChartPanel
        JPopupMenu anotherPopupMenu = new JPopupMenu();
        anotherPopupMenu.add("Another Option 1");
        anotherPopupMenu.add("Another Option 2");
        anotherChartPanel.setPopupMenu(anotherPopupMenu);

        // Use an unrelated ArrayList to store ChartPanels
        ArrayList<ChartPanel> chartPanels = new ArrayList<>();
        chartPanels.add(chartPanel);
        chartPanels.add(anotherChartPanel);

        // Iterate over the ArrayList and print the preferred sizes
        for (ChartPanel panel : chartPanels) {
            System.out.println("ChartPanel preferred size: " + panel.getPreferredSize());
        }

        // Retrieve the popup menu using the read method
        /* read */ JPopupMenu retrievedPopupMenu = chartPanel.getPopupMenu();

        // Print to verify that the read value is the same as the written value
        System.out.println(retrievedPopupMenu == popupMenu); // Should print true

        // Additional complexity: manipulate the mock chart and print its title
        mockChart.setTitle("Updated Mock Chart");
        System.out.println("Mock Chart Title: " + mockChart.getTitle());
    }
}