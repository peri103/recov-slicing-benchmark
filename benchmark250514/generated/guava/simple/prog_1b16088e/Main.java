import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        /* write */ map.putInstance(Integer.class, 42);
        /* read */ Integer value = map.getInstance(Integer.class);
        System.out.println(value);
    }
}