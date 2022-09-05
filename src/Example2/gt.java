package Example2;

import java.util.Scanner;

public class gt {
    public static void main(String args[]) {
        int a;
boolean n = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        a = sc.nextInt();
       for (int i = 3; i <=a; i++){
          n = true;
          for (int j =2; j<=i; j++){
              if(i%j==0)
                  n=false;
          }
          if(n==true) {
              System.out.println("Số" + a + "la so nguyen to");
          }else  System.out.println("khong la snt");
       }
    }


    }


