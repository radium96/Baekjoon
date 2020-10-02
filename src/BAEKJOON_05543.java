import java.util.Scanner;

public class BAEKJOON_05543 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, x, y, A, B;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        
        if (a>=b) {
            if (b>=c)    {A=c;}
            else         {A=b;}
        } else {
            if (a>=c)    {A=c;}
            else         {A=a;}
        }
        
        if (x>=y)        {B=y;}
        else             {B=x;}
        
        System.out.println(A+B-50);
    }
}
