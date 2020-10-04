import java.util.Scanner;

public class BAEKJOON_01003 {
    
    public static int[] dp = new int[41];
    public static int[] zero = new int[41];
    public static int[] one = new int[41];
    public static int z = 0;
    public static int o = 0;
    
    public static int DP(int n){
        z = 0;
        o = 0;
        if(n==0) {
            z++;
            dp[0] = 0;
            zero[0] = z;
            one[0] = o;
        } else if (n==1){
            o++;
            dp[1] = 1;
            zero[1] = z;
            one[1] = o;
        } else if (dp[n] != 0) {
            
        } else {
            dp[n] = DP(n-1) + DP(n-2);
            zero[n] = zero[n-1] + zero[n-2];
            one[n] = one[n-1] + one[n-2];
        }
        z = zero[n];
        o = one[n];
        return dp[n];
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0;i<n;i++){
            int m = sc.nextInt();
            int trash = DP(m);
            System.out.println(z + " " + o);
        }
    }
}