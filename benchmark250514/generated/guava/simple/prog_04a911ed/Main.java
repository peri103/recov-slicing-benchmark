import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {
        MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        String valueToWrite = "Hello, World!";
        /* write */ map.putInstance(String.class, valueToWrite);
        
        /* read */ String valueRead = map.getInstance(String.class);
        System.out.println(valueRead);
    }
}