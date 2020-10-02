import java.util.Scanner;

public class BAEKJOON_02908 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        int a1, a2, a3;
        int b1, b2, b3;
        int A, B;
        
        a1 = a/100;
        a2 = (a%100)/10;
        a3 = a%10;
        
        b1 = b/100;
        b2 = (b%100)/10;
        b3 = b%10;
        
        A = 100*a3+10*a2+a1;
        B = 100*b3+10*b2+b1;
        
        if(A<=B) {System.out.println(B);}
        else     {System.out.println(A);}
    }
}