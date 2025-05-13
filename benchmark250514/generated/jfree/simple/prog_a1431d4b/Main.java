import org.jfree.chart.title.TextTitle;

public class Main {
    public static void main(String[] args) {
        TextTitle title = new TextTitle();
        /* write */ title.setText("Hello World");
        /* read */ String text = title.getText();
        System.out.println(text);
    }
}