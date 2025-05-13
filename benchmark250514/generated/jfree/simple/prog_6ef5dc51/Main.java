import org.jfree.chart.ChartPanel;
import javax.swing.JPopupMenu;

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

        // Use the read method to get the popup menu
        /* read */ JPopupMenu retrievedPopupMenu = chartPanel.getPopupMenu();

        // Print out the items in the retrieved popup menu to verify
        for (int i = 0; i < retrievedPopupMenu.getComponentCount(); i++) {
            System.out.println(retrievedPopupMenu.getComponent(i));
        }
    }
}