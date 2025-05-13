import javax.swing.JPopupMenu;
import org.jfree.chart.ChartPanel;

public class Main {
    public static void main(String[] args) {
        // Initialize the ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        // Create a JPopupMenu object to use with the ChartPanel
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add("Menu Item 1");
        popupMenu.add("Menu Item 2");

        // Write operation: set the popup menu for the chart panel
        /* write */ chartPanel.setPopupMenu(popupMenu);

        // Read operation: retrieve the popup menu from the chart panel
        /* read */ JPopupMenu retrievedMenu = chartPanel.getPopupMenu();

        // Verify the retrieved popup menu
        System.out.println("Popup Menu Items:");
        for (int i = 0; i < retrievedMenu.getComponentCount(); i++) {
            System.out.println(retrievedMenu.getComponent(i));
        }
    }
}