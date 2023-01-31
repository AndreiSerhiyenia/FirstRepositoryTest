package LessonsSimple.AliszevLessonsSimpleJava;

public class Lesson16_Methods2 {
    public static void main(String[] args) {
        Person3 person1 = new Person3();
        Person3 person2 = new Person3();
        Person3 person3 = new Person3();

        person1.age = 10;
        person1.name = "Tom";
        person1.speak();
        person1.sayHello();
        person1.calculateYearsToRetirement();

        person2.age = 20;
        person2.name = "Bob";
        person2.speak();
        person2.calculateYearsToRetirement();


        person3.age = 25;
        person3.name = "Ray";
        person3.go();
        person3.calculateYearsToRetirement();

        int years1 = person1.retirement();
        int years2 = person2.retirement();
        int years3 = person3.retirement();
        System.out.println(years1 + " - Return years");
        System.out.println(years2 + " - Return years");
        System.out.println(years3 + " - Return years");
    }
}

class Person3 {
    String name;
    int age;

    int retirement() {
        int years = 100 - age;
        return years;
    }

    void calculateYearsToRetirement(){
        int years = 65 - age;
        System.out.println("Years To Retirement " + years);
    }

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


