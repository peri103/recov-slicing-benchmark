import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Main {
    public static void main(String[] args) {
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        /* write */ ImmutableClassToInstanceMap<Object> map = builder.put(String.class, "Hello World").build();
        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);
    }
}