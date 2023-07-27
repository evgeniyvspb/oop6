package Lesson2;
public class Doctor extends Human{
    Integer cabinet;

    public Doctor(String name, String profession, Integer age,Integer cabinet) {
        super(name, profession, age);
        this.cabinet=cabinet;
    }

    public Integer getCabinet() {
        return cabinet;
    }

    public void setCabinet(Integer cabinet) {
        this.cabinet = cabinet;
    }

    // @Override
    // public void run(Integer speed) {
    //     System.out.println("I can run with a speed " + speed);
    // }
}
