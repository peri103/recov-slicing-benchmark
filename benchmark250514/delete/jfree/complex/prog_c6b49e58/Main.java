import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import javax.swing.JPopupMenu;
import java.awt.Dimension;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, new Plot() {}, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        JPopupMenu popupMenu = new JPopupMenu();
        
        // Set the popup menu, marked with /* write */
        /* write */ chartPanel.setPopupMenu(popupMenu);
        
        // Add more complex operations
        chartPanel.setPreferredSize(new Dimension(800, 600));
        chartPanel.setBackground(Color.WHITE);
        
        // Create another ChartPanel and manipulate it
        ChartPanel anotherChartPanel = new ChartPanel(chart);
        JPopupMenu anotherPopupMenu = new JPopupMenu();
        anotherChartPanel.setPopupMenu(anotherPopupMenu);
        anotherChartPanel.setBackground(Color.LIGHT_GRAY);
        
        // Perform some operations unrelated to the popup menu
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setZoomOutFactor(0.9);
        
        // Retrieve the popup menu, marked with /* read */
        /* read */ JPopupMenu retrievedMenu = chartPanel.getPopupMenu();
        
        // Verify the retrieved menu
        System.out.println(retrievedMenu == popupMenu); // This should print true if the read and write operations are successful
        
        // Additional operations to make the program more complex
        anotherChartPanel.setZoomInFactor(1.1);
        anotherChartPanel.setMouseWheelEnabled(false);
        
        System.out.println("ChartPanel background color: " + chartPanel.getBackground());
        System.out.println("Another ChartPanel background color: " + anotherChartPanel.getBackground());
    }
}