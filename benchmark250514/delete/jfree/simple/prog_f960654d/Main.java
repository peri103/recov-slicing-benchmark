import org.jfree.chart.title.Title;

public class Main {
    public static void main(String[] args) {
        Title title = new Title() {
            private String text;

            @Override
            public String getText() {
                return text;
            }

            @Override
            public void setText(String text) {
                this.text = text;
            }
        };

        /* write */ title.setText("Hello, World!");
        /* read */ String value = title.getText();
        System.out.println(value);
    }
}