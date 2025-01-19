package Lab_4;

import java.util.Arrays;

public class NewTask3 {

    public static void main (String[] args){
        double[] arr = {10, 2, 25.5, 30, 15.2};
        System.out.print("Result: ");
        System.out.print(Arrays.toString(task(arr)));
    }

    public static double[] task(double[] array){

        double min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        if (min != 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] / min;
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] = -10;
            }
        }
        return array;
    }
}
