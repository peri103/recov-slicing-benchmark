import org.jfree.chart.ChartPanel;
import javax.swing.JPopupMenu;

public class Main {
    public static void main(String[] args) {
        ChartPanel chartPanel = new ChartPanel(null);
        JPopupMenu popupMenu = new JPopupMenu();
        
        /* write */ chartPanel.setPopupMenu(popupMenu);
        /* read */ JPopupMenu retrievedMenu = chartPanel.getPopupMenu();
        
        System.out.println(retrievedMenu == popupMenu); // This should print true if the read and write operations are successful
    }
}