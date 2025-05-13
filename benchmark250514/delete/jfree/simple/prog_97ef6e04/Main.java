import org.jfree.chart.title.Title;

public class Main {
    public static void main(String[] args) {
        // Assuming Title is a class that has a setText and getText method
        Title title = new Title();
        /* write */ title.setText("Hello, World!");
        /* read */ String text = title.getText();
        System.out.println(text);
    }
}