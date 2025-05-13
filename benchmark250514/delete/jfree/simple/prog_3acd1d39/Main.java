import org.jfree.chart.title.Title;

public class Main {
    public static void main(String[] args) {
        // Assuming a hypothetical Title class with setText and getText methods
        Title title = new Title();
        /* write */ title.setText("Hello, World!");
        /* read */ String text = title.getText();
        System.out.println(text);
    }
}