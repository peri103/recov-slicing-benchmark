import org.jfree.chart.ChartPanel;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize ChartPanel
        ChartPanel chartPanel = new ChartPanel(null);

        // Create and set a JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Option 1");
        JMenuItem menuItem2 = new JMenuItem("Option 2");
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);

        // Create an unrelated ArrayList and perform operations
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        // Print the elements of the ArrayList
        for (String str : stringList) {
            System.out.println(str);
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to 10 is: " + sum);

        // Set the popup menu to the chart panel
        /* write */ chartPanel.setPopupMenu(popupMenu);

        // Use a loop to modify and print the ArrayList
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, stringList.get(i).toUpperCase());
            System.out.println(stringList.get(i));
        }

        // Get the JPopupMenu from ChartPanel
        /* read */ JPopupMenu retrievedMenu = chartPanel.getPopupMenu();

        // Verify that the retrieved menu is the same as the one set
        System.out.println(retrievedMenu == popupMenu);

        // More unrelated logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product from 1 to 5 is: " + product);
    }
}