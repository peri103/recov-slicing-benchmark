import java.util.ArrayList;
import java.util.List;

public class Processor {
    private List<DelayedElement> elements = new ArrayList<>();

    public void addElements(List<DelayedElement> elements) {
        this.elements.addAll(elements);
    }

    public void processElements() {
        for (DelayedElement element : elements) {
            System.out.println("Processing element: " + element);
        }
    }
}
