import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;

public class Student {
    private String name;
    private ImmutableClassToInstanceMap<Object> studentDetails;

    public Student(String name) {
        this.name = name;
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        /* write */ this.studentDetails = builder.put(String.class, name).build();
    }

    public String getName() {
        /* read */ return studentDetails.getInstance(String.class);
    }
}
