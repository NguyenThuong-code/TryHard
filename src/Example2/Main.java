package Example2;

import java.util.Arrays;

public class Main {
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

//        //In ra mảng sau khi đảo ngược
//        System.out.println("\nMảng sau khi đảo ngược: ");
//        for (int i = 0; i < args.length; i++)
//            System.out.print(array_a[i] + " ");
        System.out.println("--------mang da duoc sap xep----------");
        for (int i = 0; i < array_a.length; i++) {
            System.out.print(array_a[i]);

        }

        for (int i = 0; i < array_a.length/2; i++)
        {
            int empty;
            empty = array_a[i];
            array_a[i] = array_a[array_a.length-i-1];
            array_a[array_a.length-i-1] = empty;
        }
        System.out.println("--------mang da duoc sap xep----------");
        for (int i = 0; i < array_a.length; i++) {
            System.out.print(array_a[i]);

        }

    }
    }
