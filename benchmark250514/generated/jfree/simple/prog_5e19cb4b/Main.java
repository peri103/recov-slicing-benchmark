import org.jfree.chart.title.TextTitle;

public class Main {
    public static void main(String[] args) {
        TextTitle textTitle = new TextTitle();
        /* write */ textTitle.setText("Hello, World!");
        /* read */ String value = textTitle.getText();
        System.out.println(value);
    }
}