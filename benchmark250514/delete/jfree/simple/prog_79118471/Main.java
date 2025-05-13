import org.jfree.chart.title.Title;

public class Main {
    public static void main(String[] args) {
        Title title = new Title() {
            private String text;

            public void setText(String text) {
                this.text = text;
            }

            public String getText() {
                return this.text;
            }
        };

        /* write */ title.setText("Hello, World!");
        /* read */ String value = title.getText();
        System.out.println(value);
    }
}