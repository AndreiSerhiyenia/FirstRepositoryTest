package LessonsSimple.AliszevLessonsSimpleJava;

public class Lesson14_ClassesAndObjects {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        Person1 person2 = new Person1();

        person1.age = 10;
        person1.name = "Tom";

        person2.age = 20;
        person2.name = "Bob";

        System.out.println("My age " + person1.age + "years. " + "My name " + person1.name);
        System.out.println("My age " + person2.age + "years. " + "My name " + person2.name);

    }
}

class Person1 {
    String name;
    int age;
}
