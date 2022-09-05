package Example2;

import java.lang.constant.DynamicCallSiteDesc;
import java.util.Arrays;
import java.util.Scanner;

public class Arr {

    public static void main(String[] args){
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number:");
        n=sc.nextInt();

        int[] a = new int[n];
        for (int i=0; i <n;i++){
            System.out.println("Enter n number:");
            a[i]=sc.nextInt();
        }
        for(int i= 0;i< a.length;i++){
            for(int j=0; j<i; j++){
                if(a[i]<=a[j]){
                    int temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }for(int i=0; i <a.length;i++){
        System.out.println(a[i]);

    }
    }}
