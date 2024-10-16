package src;
public class Plate {

    private int food = 10;

    int getFood() {
        return food;
    }

    Plate(int food) {
        this.food = food;
    }

    void decrFood(int n) {
        food -= n;
    }

    void incrFood(int n) {
        this.food += 400;
        System.out.println("В имску коту добавили 400 грамм корма");
    }

    boolean checkFood(int n ) {
        return (food - n) >= 0;
    }




}
