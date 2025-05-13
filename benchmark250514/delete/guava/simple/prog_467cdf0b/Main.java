import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        /* write */ builder.putInstance(String.class, "Hello, world!");
        ImmutableClassToInstanceMap<Object> map = builder.build();
        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);
    }
}