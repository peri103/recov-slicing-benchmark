import org.jfree.chart.title.Title;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Assume Title is a class with setText and getText methods
        Title title = new Title();
        
        // Creating additional Title objects
        Title subtitle = new Title();
        Title caption = new Title();
        
        // Using ArrayList to store Title objects
        List<Title> titleList = new ArrayList<>();
        titleList.add(title);
        titleList.add(subtitle);
        titleList.add(caption);
        
        // Setting text for subtitle and caption
        subtitle.setText("Subtitle Text");
        caption.setText("Caption Text");
        
        // Printing text of subtitle and caption
        System.out.println(subtitle.getText());
        System.out.println(caption.getText());
        
        // Setting text for the main title
        /* write */ title.setText("Hello, World!");
        
        // Performing some operations on titleList
        for (Title t : titleList) {
            System.out.println("Title in list: " + t.getText());
        }
        
        // Additional operations with titleList
        titleList.remove(caption);
        titleList.add(new Title());
        
        // Reading text from the main title
        /* read */ String text = title.getText();
        System.out.println(text);
        
        // Further operations with titleList
        for (Title t : titleList) {
            t.setText(t.getText() + " Updated");
            System.out.println("Updated Title: " + t.getText());
        }
    }
}