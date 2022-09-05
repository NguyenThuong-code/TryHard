package Example2;

import java.util.Scanner;

public class Fibo {
    public int cal(int n){
        if(n==0||n==1){
            return  1;
        }
        return cal(n-1)+cal(n-2);
    }
    public static void main(String args[]){
        int n, Fi;
        System.out.println("Enter number:");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        Fibo fi = new Fibo();
        Fi=fi.cal(n);
        System.out.println("Fi(" + n + ") = " + Fi);
    }
}
