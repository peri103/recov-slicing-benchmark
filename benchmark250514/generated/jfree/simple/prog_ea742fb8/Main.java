import org.jfree.chart.ChartPanel;
import javax.swing.JPopupMenu;

public class Main {
    public static void main(String[] args) {
        // Initialize the ChartPanel
        ChartPanel chartPanel = new ChartPanel(null);

        // Initialize a JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add("Option 1");
        popupMenu.add("Option 2");

        // Use the write method to set the popup menu
        /* write */ chartPanel.setPopupMenu(popupMenu);

        // Use the read method to retrieve the popup menu
        /* read */ JPopupMenu retrievedPopupMenu = chartPanel.getPopupMenu();

        // Print to verify that the read value is the same as the written value
        System.out.println(retrievedPopupMenu == popupMenu); // Should print true
    }
}