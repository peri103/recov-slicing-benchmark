import org.jfree.chart.ChartPanel;
import javax.swing.JPopupMenu;

public class Main {
    public static void main(String[] args) {
        ChartPanel chartPanel = new ChartPanel(null);
        
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add("Option 1");
        
        /* write */ chartPanel.setPopupMenu(popupMenu);
        
        /* read */ JPopupMenu retrievedMenu = chartPanel.getPopupMenu();
        
        System.out.println("Retrieved Popup Menu: " + retrievedMenu.getComponent(0));
    }
}