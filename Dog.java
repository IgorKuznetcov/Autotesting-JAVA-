public class Dog extends Animal {

    public static int countOfObjects = 0;

    public Dog() {
        countOfObjects++;
    }

    public static void getCount() {
        System.out.println("Кол-во созданных собак: " + countOfObjects);
    }

    @Override
    public void swim(int len) {
        if (len > 10 || len < 0 ) {
            System.out.println("Собаки плавают не больше 10 м");
        } else {
            super.swim(len);
        }

    }

    @Override
    public void run(int len) {
        if (len > 500 || len < 0 ) {
            System.out.println("Собака максимум бежит на 200 м");
        } else {
            super.run(len);
        }
    }
}
