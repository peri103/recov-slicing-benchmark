public class Student {
    private String name;
    private StudentDetails details;

    public Student(String name, int age) {
        this.name = name;
        this.details = new StudentDetails(age);
    }

    public void setDetail(Class<?> type, Object instance) {
        details.setDetail(type, instance);
    }

    public Object getDetail(Class<?> type) {
        return details.getDetail(type);
    }

    public String getName() {
        return name;
    }
}
