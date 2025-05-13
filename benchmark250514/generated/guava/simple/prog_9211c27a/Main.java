import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        /* write */ map.putInstance(String.class, "Hello World");
        
        /* read */ String value = map.getInstance(String.class);
        
        System.out.println(value);
    }
}