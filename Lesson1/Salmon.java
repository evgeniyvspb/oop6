import Lesson2.Swimable;

public class Salmon extends Animal implements Swimable {
    
    @Override
    public void swim(Integer speed){
        System.out.println("Я умею плавать со скоростью" +  speed);
    }
}
