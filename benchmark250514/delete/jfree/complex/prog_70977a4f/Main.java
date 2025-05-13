import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import javax.swing.JPopupMenu;
import java.awt.Color;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a ChartPanel with a null chart
        ChartPanel chartPanel = new ChartPanel(null);
        
        // Create a JPopupMenu and set it to the ChartPanel
        JPopupMenu popupMenu = new JPopupMenu("Test Menu");
        popupMenu.add("Option 1");
        popupMenu.add("Option 2");
        
        /* write */ chartPanel.setPopupMenu(popupMenu);
        
        // Create a dummy chart and set it to the ChartPanel
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Dummy Plot";
            }
        };
        JFreeChart dummyChart = new JFreeChart("Dummy Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        chartPanel.setChart(dummyChart);
        
        // Generate random colors for the chart background
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            chartPanel.setBackground(randomColor);
            System.out.println("Background set to: " + randomColor);
        }
        
        // Retrieve the popup menu and print its label
        /* read */ JPopupMenu retrievedMenu = chartPanel.getPopupMenu();
        System.out.println("Retrieved menu label: " + retrievedMenu.getLabel());
        
        // Print the chart title
        System.out.println("Chart title: " + chartPanel.getChart().getTitle().getText());
        
        // Modify the plot type and print it
        plot.setNoDataMessage("No Data Available");
        System.out.println("Plot type: " + plot.getPlotType());
        
        // Add additional options to the popup menu
        popupMenu.add("Option 3");
        popupMenu.add("Option 4");
        System.out.println("Popup menu options added.");
    }
}