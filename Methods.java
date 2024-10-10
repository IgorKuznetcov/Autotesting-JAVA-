public class Methods {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void printThreeWords() {
        System.out.println("Orange, Banana, Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 20;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;

        if (value <= 0){
            System.out.println("Красный");
        } if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 200;
        int b = 250;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
