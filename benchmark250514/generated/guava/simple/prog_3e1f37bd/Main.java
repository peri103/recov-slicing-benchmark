import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        /* write */ map.putInstance(String.class, "Hello, world!");
        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);
    }
}