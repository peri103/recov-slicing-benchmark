import org.jfree.chart.title.Title;

public class Main {
    public static void main(String[] args) {
        Title chartTitle = new Title();
        /* write */ chartTitle.setText("Chart Title Example");
        /* read */ String titleText = chartTitle.getText();
        System.out.println(titleText);
    }
}