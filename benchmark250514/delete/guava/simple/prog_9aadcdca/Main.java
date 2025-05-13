import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {
        MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        // Create a type token for Integer class
        TypeToken<Integer> integerTypeToken = TypeToken.of(Integer.class);
        
        /* write */ map.putInstance(Integer.class, 42);
        
        /* read */ Integer value = map.getInstance(integerTypeToken);
        
        System.out.println(value);
    }
}