import java.util.Scanner;

public class BAEKJOON_11050 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a=1, b=1, c=1;
        
        for(int i = 1;i<=n;i++){
            a=a*i;
        }
        for(int i = 1;i<=k;i++){
            b=b*i;
        }
        for(int i = 1;i<=n-k;i++){
            c=c*i;
        }
        System.out.println(a/(b*c));
    }
}
