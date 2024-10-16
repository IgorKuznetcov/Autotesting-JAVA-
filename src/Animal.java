package src;
public class Animal {
    String name;


    public static int countOfObjects = 0;

    public Animal() {
        countOfObjects++;
    }

    public static void getCount() {
        System.out.println("Кол-во созданных животных: " + countOfObjects);
    }

    public void run(int len) {
        System.out.println(this.name + " пробежал " + len + " метров");
    }

    public void swim (int len) {
        System.out.println(this.name + " проплыл " + len + " метров");
    }
}
