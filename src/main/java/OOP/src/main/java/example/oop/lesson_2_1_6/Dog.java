package OOP.src.main.java.example.oop.lesson_2_1_6;

public class Dog {
    private String name;

    public static void sayHello() {
        System.out.println("Гав");
    }

    public static void catchCat(Cat cat) {
        System.out.println("Кошка поймана");
        sayHello();
        cat.sayHello();
    }

}
