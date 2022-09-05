package flinter;

import java.util.Scanner;

public class giaiThua {
    public static void main (String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n ");
        n=sc.nextInt();
        int a =1;
        for(int i=1; i <=n; i++){
            a=a*i;

        }
System.out.println(a);
    }
}
