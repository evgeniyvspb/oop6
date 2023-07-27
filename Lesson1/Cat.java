import Lesson2.Illable;
import Lesson2.Runnable;

public class Cat extends Animal implements Runnable, Illable {
    private int countPaws;
    
    public Cat (){
        this("Max",null,null, false, 4);
    }
    public Cat (String animal, String ownerName, String diagnosis, Boolean isVaccinated, int countPaws ){
        super( animal, ownerName,diagnosis,  isVaccinated);
        this.countPaws = countPaws;
    }
    private void wakeUp (){
        System.out.println("Кот проснулся");
    }
    private void findFood (){
        System.out.println("Кот нашел еду");
    }
    private void eat (){
        System.out.println("Кот поел");
    }
    private void sleep (){
        System.out.println("Кот уснул");
    }
   public void hunt(){
    
    wakeUp(); 
    findFood ();
    eat ();
    sleep();
   }

    

    @Override
    public void run(Integer speed) {
        System.out.println("I can run with a speed " + speed);
    }
    @Override
    public void ill() {
        System.out.println("I am ill");
    }


}
