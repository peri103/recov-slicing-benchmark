public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 20);

        // Add more details
        student.setDetail(String.class, "Computer Science");
        student.setDetail(Double.class, 3.8);

        // Retrieve and print the details
        Integer age = (Integer) student.getDetail(Integer.class);
        /* read */ System.out.println("Age: " + age);

        String major = (String) student.getDetail(String.class);
        System.out.println("Major: " + major);

        Double gpa = (Double) student.getDetail(Double.class);
        System.out.println("GPA: " + gpa);
    }
}