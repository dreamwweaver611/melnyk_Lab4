package Lab_4;

public class NewTask1 {

    public static void main (String[] args){
        double[] arr = {10.3, 5, 25.43, 30, 15};
        System.out.print("Result: ");
        System.out.print(task(arr));
    }

    public static double task(double[] array) {

        double min = array[0];
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max - min;
    }
}