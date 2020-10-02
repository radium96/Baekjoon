package project;

import java.util.Scanner;

public class BAEKJOON_02588 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a,b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        int b1,b2,b3;
        
        b1 = b/100;
        b2 = (b-b1*100)/10;
        b3 = b-b1*100-b2*10;
        
        System.out.println(a*b3);
        System.out.println(a*b2);
        System.out.println(a*b1);
        System.out.println(a*b);
    }
}
