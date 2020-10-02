import java.util.Scanner;

public class BAEKJOON_01085 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int x, y, w, h;
        
        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
        
        int X, Y;
        
        if(x > w/2)    {X=w-x;}
        else            {X=x;}
        if(y > h/2)    {Y=h-y;}
        else            {Y=y;}
        
        if(X>=Y)    {System.out.println(Y);}
        else       {System.out.println(X);}
    }
}