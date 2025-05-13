import org.jfree.chart.ChartPanel;
import javax.swing.JPopupMenu;

public class Main {
    public static void main(String[] args) {
        // Initialize ChartPanel
        ChartPanel chartPanel = new ChartPanel(null);

        // Create a JPopupMenu instance
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add("Option 1");
        popupMenu.add("Option 2");

        // Use the write method to set the popup menu
        /* write */ chartPanel.setPopupMenu(popupMenu);

        // Use the read method to get the popup menu
        /* read */ JPopupMenu retrievedMenu = chartPanel.getPopupMenu();

        // Display the result
        System.out.println("Popup Menu Items:");
        for (int i = 0; i < retrievedMenu.getComponentCount(); i++) {
            System.out.println(retrievedMenu.getComponent(i));
        }
    }
}