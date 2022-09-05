package Example2;

import java.util.Scanner;

public class ta {
    public static void main(String[] args){
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        n = sc.nextInt();
        int[] a =new int[n];
        for (int i =0; i <n; i++){
            System.out.println("Enter numbers:");
            a[i] = sc.nextInt();
        }
        for(int i=0; i <n; i++){
            for(int j=0; j<i; j++){
                if(a[i]<= a[j]){
                    int tem = a[i];
                    a[i]= a[j];
                    a[j]= tem;
                }

            }

        }
        for(int i = 0; i <n; i++){
            System.out.println(a[i]);
        }
    }
}
