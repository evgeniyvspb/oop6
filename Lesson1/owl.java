import Lesson2.Flyable;
import Lesson2.Illable;

public class owl extends Animal implements Flyable, Illable {
   
    @Override
    public void ill() {
        System.out.println("I am ill");
    }

    @Override
    public void fly() {
        System.out.println("I am flying very well");
    }

    @Override
    public void fly(Integer speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
}
