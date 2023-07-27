import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new Animal("Барсик", "Ольга", "простуда", false);

        System.out.println(barsik.isVaccinated());
        barsik.setVaccinated(true);
        System.out.println(barsik.isVaccinated());
        System.out.println(barsik.getType());
        Cat cat = new Cat();

        System.out.println(cat);

        Animal musya = new Cat();
        Dog pes = new Dog();
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(barsik);
        animals.add(pes);
        cat.toGo(); // вызывается из родительского класса
        cat.fly(); // вызывается из переопределенного метода внутри класса Сat
        cat.swim(); // вызывается из переопределенного метода внутри класса Сat
        System.out.println("___________________________");
        Animal flyingFish = new Salmon();
        flyingFish.fly();
        flyingFish.toGo();
        flyingFish.swim();
        System.out.println("___________________________");
        Animal chicken = new owl();
        chicken.fly();
        chicken.toGo();
        chicken.swim();
        String ownerEagle = chicken.ownerName = " Я вольная птица. У меня нет хозяина";
        System.out.println(ownerEagle);
        System.out.println("___________________________");
    }
}
