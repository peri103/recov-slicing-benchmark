import org.jfree.chart.title.Title;

public class Main {
    public static void main(String[] args) {
        Title title = new Title();
        /* write */ title.setText("Chart Title");
        /* read */ String value = title.getText();
        System.out.println(value);
    }
}