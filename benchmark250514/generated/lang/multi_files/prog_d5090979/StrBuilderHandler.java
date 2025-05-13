import org.apache.commons.lang3.text.StrBuilder;

public class StrBuilderHandler {
    private StrBuilder strBuilder = new StrBuilder("Hello, World!");

    public void modifyStrBuilder() {
        strBuilder.append(" More Text!");
        strBuilder.insert(0, "Start: ");
        /* write */ strBuilder.setLength(5);
    }

    public String getStrBuilderContent() {
        /* read */ return strBuilder.toString();
    }
}
