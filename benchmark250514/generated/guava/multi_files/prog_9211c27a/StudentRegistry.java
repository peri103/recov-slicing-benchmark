import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

public class StudentRegistry {
    private ClassToInstanceMap<Object> registry;

    public StudentRegistry() {
        this.registry = MutableClassToInstanceMap.create();
    }

    public void registerStudent(Student student) {
        /* write */ registry.putInstance(Student.class, student);
    }

    public Student getRegisteredStudent() {
        /* read */ return registry.getInstance(Student.class);
    }
}
