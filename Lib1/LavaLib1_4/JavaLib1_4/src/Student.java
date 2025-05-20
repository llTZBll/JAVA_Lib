public class Student extends Person {
    private int id;

    public Student(String name, int age, char sex, int id) {
        super(name, age, sex);
        this.id = id;
    }

    @Override
    public String show() {
        return super.show() + " " + id;
    }
}