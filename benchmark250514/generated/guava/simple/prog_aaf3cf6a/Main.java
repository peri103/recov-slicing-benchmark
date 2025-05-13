import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        /* write */ map.putInstance(Integer.class, 42);
        /* read */ Integer value = map.getInstance(Integer.class);
        System.out.println(value);
    }
}