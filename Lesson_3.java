import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
        System.out.println(numbers(5,10));
        positivOrNegativ(-1);
        System.out.println(positivOrNegativ2(-2));
        printString("Вася пупкин", 5);
        System.out.println(checkYear(1993));
        changeNumber();
        arrEmptyValue();
        multipleNumber();
        doubleArr();
        System.out.println(Arrays.toString(returnValueLen(5,10)));
    }

    public static boolean numbers(int a, int b) {
        int result = a + b;
            if ( result >= 10 & result <= 20){
                return true;
            } else {
                return false;
            }
    }

    public static void positivOrNegativ(int a) {
        if ( a < 0) {
            System.out.println("Отрицательное!");
        } else {
            System.out.println("Положительное!");
        }
    }

    public static boolean positivOrNegativ2(int a) {
        if ( a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printString(String str, int a ) {
        for (int i = 0; i < a; i++ ) {
            System.out.println(str);
        }
    }

    public static boolean checkYear (int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void changeNumber() {
        int [] numbers = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                numbers[i] = 1;
                } else if (numbers[i] == 1) {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void arrEmptyValue() {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            int cont = i;
            cont += 1;
            arr[i] = cont;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void multipleNumber() {
        int [] numbers = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i]  = numbers[i] * 2;
            }

        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void doubleArr() {
        int doubleArr [][] = new int[5][5];

        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < doubleArr.length; j++) {
                doubleArr[i][j] = 0;
                if (doubleArr[i] == doubleArr[j]) {
                    doubleArr[i][j] = 1;
                } else {
                    doubleArr[i][j] = 0;
                }
                System.out.printf("%3d",doubleArr[i][j]);
            }
            System.out.println();

        }
    }

    public static int [] returnValueLen (int len, int initialValue) {

        int [] arr = new int [len];
         for ( int i = 0; i < arr.length; i ++) {
             arr[i] = initialValue;
         }
          return arr;
    }
}


