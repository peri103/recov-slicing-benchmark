import org.jfree.chart.ChartPanel;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize ChartPanel and JPopupMenu
        ChartPanel chartPanel = new ChartPanel(null);
        JPopupMenu popupMenu = new JPopupMenu();
        
        // Add items to the popup menu
        JMenuItem menuItem1 = new JMenuItem("Option 1");
        JMenuItem menuItem2 = new JMenuItem("Option 2");
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        
        // Use ArrayList for unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        
        // Perform calculations with numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Set the popup menu to the chart panel
        /* write */ chartPanel.setPopupMenu(popupMenu);
        
        // More unrelated operations
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        
        for (String str : strings) {
            System.out.println(str);
        }
        
        // Retrieve the popup menu from the chart panel
        /* read */ JPopupMenu readPopupMenu = chartPanel.getPopupMenu();
        
        // Verify the operation
        System.out.println(readPopupMenu == popupMenu); // Should print true if the read operation is successful
        
        // Print the items from the read popup menu
        for (int i = 0; i < readPopupMenu.getComponentCount(); i++) {
            JMenuItem item = (JMenuItem) readPopupMenu.getComponent(i);
            System.out.println("Menu Item: " + item.getText());
        }
    }
}