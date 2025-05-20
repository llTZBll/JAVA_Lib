public class Main {
    public static void main(String[] args) {
        Person person = new Person("张三", 20, '男');
        System.out.println(person.show());

        Student student = new Student("李四", 19, '女', 1001);
        System.out.println(student.show());
    }
}