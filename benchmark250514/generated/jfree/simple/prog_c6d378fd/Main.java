import org.jfree.chart.ChartPanel;
import javax.swing.JPopupMenu;

public class Main {
    public static void main(String[] args) {
        ChartPanel chartPanel = new ChartPanel(null);
        JPopupMenu popupMenu = new JPopupMenu();
        
        /* write */ chartPanel.setPopupMenu(popupMenu);
        
        /* read */ JPopupMenu readPopupMenu = chartPanel.getPopupMenu();
        
        System.out.println(readPopupMenu == popupMenu); // Should print true if the read operation is successful
    }
}