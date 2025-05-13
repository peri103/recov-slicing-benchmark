import org.jfree.chart.title.Title;

public class TitleManager {
    private Title title;

    public TitleManager() {
        this.title = new Title();
    }

    public void setTitleText(String text) {
        /* write */ title.setText(text);
    }

    public String getTitleText() {
        return title.getText();
    }
}
