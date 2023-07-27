package Lesson2;
public abstract class Human {
    protected String name;
    protected String profession;
    protected Integer age;

    public Human(String name, String profession, Integer age) {
        this.name=name;
        this.profession=profession;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(String owner) {
        this.profession = owner;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
