import org.jfree.chart.title.TextTitle;

public class Main {
    public static void main(String[] args) {
        // Initialize the TextTitle object
        TextTitle title = new TextTitle();

        // Use the setText method to write a value
        /* write */ title.setText("Hello, World!");

        // Use the getText method to read the value
        /* read */ String value = title.getText();

        // Print the value to verify
        System.out.println(value);
    }
}