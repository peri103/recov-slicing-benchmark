import org.jfree.chart.title.Title;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Title chartTitle = new Title();
        ArrayList<String> titleList = new ArrayList<>();
        HashMap<String, Integer> titleMap = new HashMap<>();

        /* write */ chartTitle.setText("Chart Title Example");
        titleList.add("First Title");
        titleList.add("Second Title");

        // Manipulating the title list
        for (String title : titleList) {
            titleMap.put(title, title.length());
        }

        // Adding more titles
        titleList.add("Third Title");
        titleList.add(chartTitle.getText());

        // Performing operations on titleMap
        int totalLength = 0;
        for (Integer length : titleMap.values()) {
            totalLength += length;
        }
        System.out.println("Total length of titles: " + totalLength);

        // Retrieve the text from the Title object
        /* read */ String titleText = chartTitle.getText();
        System.out.println("Chart Title: " + titleText);

        // Print all titles in the list
        System.out.println("All Titles:");
        for (String title : titleList) {
            System.out.println(title);
        }

        // Further operations on the title list
        titleList.remove(0);
        titleList.add("Fourth Title");

        // Print titles again after modifications
        System.out.println("Modified Titles:");
        for (String title : titleList) {
            System.out.println(title);
        }
    }
}