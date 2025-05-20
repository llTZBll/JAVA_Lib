public class Person {
    protected String name;
    protected int age;
    protected char sex;

    public Person() {
        this("", 0, ' ');
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String show() {
        return name + " " + sex + " " + age;
    }
}