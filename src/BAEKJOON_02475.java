import java.util.Scanner;

public class BAEKJOON_02475 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, d, e;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        int T = (a*a+b*b+c*c+d*d+e*e)%10;
        System.out.println(T);
    }
}