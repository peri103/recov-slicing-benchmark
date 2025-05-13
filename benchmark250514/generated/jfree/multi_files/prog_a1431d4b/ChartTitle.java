import org.jfree.chart.title.TextTitle;

public class ChartTitle {
    private TextTitle title;

    public ChartTitle() {
        this.title = new TextTitle();
    }

    public void setTitleText(String text) {
        /* write */ title.setText(text);
    }

    public String getTitleText() {
        return title.getText();
    }
}
