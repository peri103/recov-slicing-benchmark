import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class StringProcessor {
    private BlockingDeque<String> stringDeque = new LinkedBlockingDeque<>();

    public void addString(String str) {
        stringDeque.addLast(str);
    }

    public String getString() throws InterruptedException {
        return stringDeque.takeFirst();
    }
}
