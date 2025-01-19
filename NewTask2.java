package Lab_4;

public class NewTask2 {

    public static void main (String[] args){
        double[] arr = {10.5, 7.5, 4.5, 9};
        System.out.print("Result: ");
        System.out.print(task(arr));
    }

    public static double task(double[] array) {

        double max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max - array[array.length-2];
    }
}
