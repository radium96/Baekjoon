package project;

import java.util.Scanner;

public class BAEKJOON_10817 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp;
        
        if (a>=b){
            if (a>=c){
                if (b>=c){System.out.println(b);}
                else {System.out.println(c);}
            } else {
                System.out.println(a);
            }
        } else {
            if (b>=c){
                if (a>=c){System.out.println(a);}
                else {System.out.println(c);}
            } else {
                System.out.println(b);
            }
        }
    }
}
