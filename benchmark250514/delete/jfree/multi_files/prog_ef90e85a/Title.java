import org.jfree.chart.title.Title;

public class TitleWrapper extends Title {
    private String text;

    @Override
    public void setText(String text) {
        /* write */ this.text = text;
    }

    @Override
    public String getText() {
        return this.text;
    }
}