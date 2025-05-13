import org.apache.commons.collections4.map.AbstractLinkedMap;
import org.apache.commons.collections4.map.LinkedMap;

public class Main {
    public static void main(String[] args) {
        AbstractLinkedMap map = new LinkedMap();
        /* write */ map.put("key", "value");
        /* read */ String value = (String) map.get("key");
        System.out.println(value);
    }
}