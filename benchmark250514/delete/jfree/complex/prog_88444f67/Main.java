import org.jfree.chart.title.Title;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Title title = new Title();
        ArrayList<String> titleList = new ArrayList<>();
        
        // Adding some titles to the list
        titleList.add("Title 1");
        titleList.add("Title 2");
        titleList.add("Title 3");
        
        // Set the text for the title
        /* write */ title.setText("Hello World");
        
        // Manipulate the list of titles
        for (String t : titleList) {
            System.out.println("Processing: " + t);
        }
        
        // Perform operations on the title
        String newTitle = "New Title";
        titleList.add(newTitle);
        titleList.remove(0);
        
        // More complex operations
        ArrayList<String> processedTitles = new ArrayList<>();
        for (String t : titleList) {
            processedTitles.add(t.toUpperCase());
        }
        
        // Print processed titles
        for (String t : processedTitles) {
            System.out.println("Processed Title: " + t);
        }
        
        // Get the text from the title
        /* read */ String value = title.getText();
        System.out.println(value);
        
        // More operations after reading
        titleList.add(value);
        for (String t : titleList) {
            System.out.println("Final Title List: " + t);
        }
    }
}