import java.util.Scanner;

public class BAEKJOON_01110 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int temp = a;
        int count = 0;
        
        int n,m,l;
        
        while((count==0)||(temp!=a)){
            n=a/10;
            m=a%10;
            l=n+m;
            a=(m*10)+(l%10);
            count++;
        }
        
        System.out.println(count);
    }
}
