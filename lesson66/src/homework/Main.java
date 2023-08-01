package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister persister=new Persister();
        Report report = new Report();
        report.report(user);;
        persister.save(user);
    }
}