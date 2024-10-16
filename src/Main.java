package src;

public class Main {
    public static void main(String[] args) {
        Cat cat_1 = new Cat();
        cat_1.name = "Барсик";
        cat_1.swim(10);
        cat_1.run(300);
        Cat cat_2 = new Cat();
        Cat cat_3 = new Cat();

        Cat.getCount();
        Dog.getCount();

        Circle c_1 = new Circle();
        c_1.backgroundColor = "Красный";
        c_1.borderColor = "Зеленый";
        c_1.info();

        Triangle t_1 = new Triangle();
        t_1.backgroundColor = "Желтый";
        t_1.borderColor = "Синий";
        t_1.info();


    }
}
