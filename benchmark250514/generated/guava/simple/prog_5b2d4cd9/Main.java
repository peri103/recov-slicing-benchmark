import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {
        MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        /* write */ map.putInstance(String.class, "Hello, World!");
        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);
    }
}