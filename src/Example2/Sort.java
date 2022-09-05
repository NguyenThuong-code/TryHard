package Example2;

public class Sort {
    public static void main(String[] args) {
    int[] array_a = {3, 1, 5, 7, 4};
        for (int i = 0; i < array_a.length; i++) {

        for (int j = 0; j <= i; j++) {

            if (array_a[i] <= array_a[j]) {
                int temp = array_a[i];
                array_a[i] = array_a[j];
                array_a[j] = temp;


            }

        }

    }

         System.out.println("--------mang da duoc sap xep----------");
        for (int i = 0; i < array_a.length; i++) {
        System.out.print(array_a[i]);

    }
}}