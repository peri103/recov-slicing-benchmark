import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class Student {
    private String name;
    private ImmutableMultimap<String, String> multimap;

    public Student(String name) {
        this.name = name;
        Builder<String, String> builder = ImmutableMultimap.builder();
        /* write */ builder.put("grade", "A");
        this.multimap = builder.build();
    }

    public String getGrade() {
        /* read */ return multimap.get("grade").iterator().next();
    }

    public String getName() {
        return name;
    }
}
