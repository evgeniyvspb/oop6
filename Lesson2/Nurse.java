package Lesson2;

public class Nurse extends Human implements Swimable{
    Boolean ukoli;
    public Nurse(String name, String profession, Integer age, Boolean ukoli) {
        super(name, profession, age);
        this.ukoli=ukoli;
    }

    public Boolean getUkol() {
        return ukoli;
    }

    public void setUkol(Boolean ukoli) {
        this.ukoli=ukoli;
    }


    @Override
    public void swim(Integer speed) {
        System.out.println("I can swim with a speed " + speed);
    }
}
