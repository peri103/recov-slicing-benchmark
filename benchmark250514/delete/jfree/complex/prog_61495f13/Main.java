import org.jfree.chart.title.Title;
import org.jfree.chart.title.TextTitle;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a Title object
        Title title = new Title();
        
        // Create a new TextTitle object and perform some operations
        TextTitle textTitle = new TextTitle("Initial Text");
        textTitle.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 12));
        textTitle.setPaint(java.awt.Color.BLUE);
        
        // Create an ArrayList to store Title objects
        ArrayList<Title> titleList = new ArrayList<>();
        titleList.add(textTitle);
        
        // Add some more titles
        for (int i = 0; i < 3; i++) {
            TextTitle tempTitle = new TextTitle("Title " + i);
            tempTitle.setFont(new java.awt.Font("Serif", java.awt.Font.ITALIC, 10 + i));
            titleList.add(tempTitle);
        }
        
        // Perform operations on the list
        for (Title t : titleList) {
            System.out.println(((TextTitle) t).getText());
        }
        
        // Set the text of the original title
        /* write */ title.setText("Chart Title");
        
        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Retrieve and print the text of the original title
        /* read */ String value = title.getText();
        System.out.println("Original Title Text: " + value);
        
        // Modify the titles in the list
        for (Title t : titleList) {
            ((TextTitle) t).setText(((TextTitle) t).getText() + " - Modified");
        }
        
        // Print modified titles
        for (Title t : titleList) {
            System.out.println(((TextTitle) t).getText());
        }
    }
}