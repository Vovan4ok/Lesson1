import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        char g;
        boolean h;
        System.out.println("Byte MIN_VALUE: " + Byte.MIN_VALUE + ". Byte MAX_VALUE: " + Byte.MAX_VALUE);
        System.out.println("Short MIN_VALUE: " + Short.MIN_VALUE + ". Short MAX_VALUE: " + Short.MAX_VALUE);
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE + ". Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Long MIN_VALUE: " + Long.MIN_VALUE + ". Long MAX_VALUE: " + Long.MAX_VALUE);
        System.out.println("Float MIN_VALUE: " + Float.MIN_VALUE + ". Float MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE + ". Double MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Character MIN_VALUE: " + Character.MIN_VALUE + ". Character MAX_VALUE: " + Character.MAX_VALUE);
        System.out.println("Boolean FIRST_VALUE: " + Boolean.TRUE + ". Boolean SECOND_VALUE: " + Boolean.FALSE);
        int[] array = {4, 1, 12, 7, 3, 5, 10, 9, 1, 2};
        int min = array[0], max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Min value of the array: " + min + ". Max value of the array: " + max);
    }
}