package LessonsSimple.AliszevLessonsSimpleJava;

public class Lesson17_Methods3 {
    public static void main(String[] args) {
        Person4 person1 = new Person4();
        Person4 person2 = new Person4();
        Person4 person3 = new Person4();

        person1.age = 50;
        person1.setName("Jack");
        person1.speak();

        String s1 = "Bob";
        person2.age = 20;
        person2.setName(s1);
        person2.speak();

        person3.age = 25;
        person3.name = "Ray";
        person3.setNameAndAge("Ray2", 99);
        person3.speak();
        person3.calculateYearsToRetirement();

        int years1 = person1.retirement();
        System.out.println(years1 + " - Return years");
    }
}

class Person4 {
    String name;
    int age;

    void setName(String username){
        name = username;
    }

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

    int retirement() {
        int years = 100 - age;
        return years;
    }

    void calculateYearsToRetirement(){
        int years = 65 - age;
        System.out.println("Years To Retirement " + years);
    }

    void speak() {
        for (int i = 0; i < 1; i++) {
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
