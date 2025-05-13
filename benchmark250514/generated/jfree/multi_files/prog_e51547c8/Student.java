public class Student {
    private String name;
    private StepPointManager stepPointManager = new StepPointManager();

    public Student(String name) {
        this.name = name;
    }

    public void setStepPoint(double point) {
        stepPointManager.setStepPoint(point);
    }

    public double getStepPoint() {
        return stepPointManager.getStepPoint();
    }

    public String getName() {
        return name;
    }
}
