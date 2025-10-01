package practice1;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double sr = (double) sum / arr.length;

        System.out.println(sum);
        System.out.println(sr);
    }
}
