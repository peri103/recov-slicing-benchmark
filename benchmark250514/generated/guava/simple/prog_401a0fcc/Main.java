import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        /* write */ builder.put(String.class, "Hello, World!");
        ImmutableClassToInstanceMap<Object> map = builder.build();
        /* read */ String value = (String) map.getInstance(String.class);
        System.out.println(value);
    }
}