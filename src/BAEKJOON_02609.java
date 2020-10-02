import java.util.Scanner;

public class BAEKJOON_02609 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int big=0, small=0, d=1;
        
        if(a<=b) {
            big = b;
            small = a;
        } else {
            big = a;
            small = b;
        }
        
        while(d>0){
            d=big%small;
            big=small;
            small=d;
        }
        System.out.println(big);
        System.out.println(a*b/big);
    }
}