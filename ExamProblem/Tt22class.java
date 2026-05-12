class Person {
    String name;
    int age;
    String phoneNumber;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.phoneNumber = "Not Provided";
    }

    Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
    }
}

public class Tt22class {
    public static void main(String[] args) {

        Person p1 = new Person("Mithi", 24);
        Person p2 = new Person("Rafi", 71, "01771812720");

        p1.display();
        p2.display();
    }
}
