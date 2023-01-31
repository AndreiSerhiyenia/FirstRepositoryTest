package LessonsSimple.AliszevLessonsSimpleJava;

public class Lesson15_Methods {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person1.age = 10;
        person1.name = "Tom";
        person1.speak();
        person1.sayHello();

        person2.age = 20;
        person2.name = "Bob";
        person2.speak();

        person3.go();

    }
}

class Person {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 2; i++) {
            System.out.print("My name is " + name + ".");
            System.out.println(" My age is " + age + " years.");
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }

    public void go() {
        System.out.println("I went");
    }
}

