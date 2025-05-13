import org.jfree.chart.title.Title;

public class TitleManager {
    private Title title = new Title();

    public void updateTitle(String newText) {
        /* write */ title.setText(newText);
    }

    public String retrieveTitle() {
        return title.getText();
    }
}
