import org.jfree.chart.ChartPanel;
import javax.swing.JPopupMenu;

public class Main {
    public static void main(String[] args) {
        // Initialize ChartPanel
        ChartPanel chartPanel = new ChartPanel(null);

        // Create and set a JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();
        /* write */ chartPanel.setPopupMenu(popupMenu);

        // Get the JPopupMenu from ChartPanel
        /* read */ JPopupMenu retrievedMenu = chartPanel.getPopupMenu();

        // Verify that the retrieved menu is the same as the one set
        System.out.println(retrievedMenu == popupMenu);
    }
}