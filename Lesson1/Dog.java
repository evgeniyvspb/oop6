import Lesson2.Illable;
import Lesson2.Runnable;

public class Dog extends Animal implements Runnable, Illable {
    @Override
    public void run(Integer speed) {
        System.out.println("I can run with a speed " + speed);
    }

    @Override
    public void ill() {
        System.out.println("I am ill");
    }
}