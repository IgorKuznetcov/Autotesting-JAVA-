package src;
public class Cat extends Animal {

    public static int countOfObjects = 0;
    private int appetite;
    private int satietyTime;
    private int satiety;

    public Cat() {
        countOfObjects++;
    }

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

    int getSatietyTime() {
        return satietyTime;
    }

    int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    Cat(String name, int appetite, int satietyTime) {

        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = 0;
    }

    void eat(Plate p) {
        p.decrFood(appetite);
        satiety += satietyTime;
    }

    public static void getCount() {
        System.out.println("Кол-во созданных котов: " + countOfObjects);
    }

    @Override
    public void swim(int len) {
        System.out.println("Коты не умеют плавать(");
    }

    @Override
    public void run(int len) {
        if (len > 200 || len < 0 ) {
            System.out.println("Кот максимум бежит на 200 м");
        } else {
            super.run(len);
        }
    }
}
