public class BrokenDevice extends Device{
    String problems;
    int daysNeeded;

    public BrokenDevice(String brand, String model, String problems, int daysNeeded,double price) {
        super(brand, model, price);
        this.problems = problems;
        this.daysNeeded = daysNeeded;
    }

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }

    public int getDaysNeeded() {
        return daysNeeded;
    }

    public void setDaysNeeded(int daysNeeded) {
        this.daysNeeded = daysNeeded;
    }

}
