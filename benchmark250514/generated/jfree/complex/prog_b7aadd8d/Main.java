import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import org.jfree.chart.ChartPanel;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        // Create a JPopupMenu object to use with the ChartPanel
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem("Menu Item 1"));
        popupMenu.add(new JMenuItem("Menu Item 2"));

        // Write operation: set the popup menu for the chart panel
        /* write */ chartPanel.setPopupMenu(popupMenu);

        // Additional complex code
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<Integer, String> numberMap = new HashMap<>();

        // Populate the list and map
        for (int i = 0; i < 5; i++) {
            stringList.add("String " + i);
            numberMap.put(i, "Number " + i);
        }

        // Perform some operations on the list and map
        for (String str : stringList) {
            System.out.println("List item: " + str);
        }

        for (Integer key : numberMap.keySet()) {
            System.out.println("Map key-value: " + key + " -> " + numberMap.get(key));
        }

        // Additional unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Read operation: retrieve the popup menu from the chart panel
        /* read */ JPopupMenu retrievedMenu = chartPanel.getPopupMenu();

        // Verify the retrieved popup menu
        System.out.println("Popup Menu Items:");
        for (int i = 0; i < retrievedMenu.getComponentCount(); i++) {
            System.out.println(retrievedMenu.getComponent(i));
        }

        // More complex code
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integerList.add(i * 2);
        }

        for (int num : integerList) {
            System.out.println("Integer list item: " + num);
        }
    }
}