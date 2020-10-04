import java.util.Scanner;

public class BAEKJOON_01463 {
    
    public static int[] dp = new int[1000001];

    public static int DP(int n){
        if(dp[n] != 0){
            return dp[n];
        } else if(n==1){
            return dp[1]=0;
        } else {
            int c1 = 1000000;
            int c2 = 1000000;
            int c3 = 1000000;
            int c = 0;
            
            if(n%3 == 0){
                c3 = DP(n/3);
            }
            if(n%2 == 0){
                c2 = DP(n/2);
            }
                c1 = DP(n-1);
            
            if(c3<=c2){
                if(c3<=c1){
                    c = 3;
                } else {
                    c = 1;
                }
            } else if(c2<=c3){
                if(c2<=c1){
                    c = 2;
                } else {
                    c = 1;
                }
            }
            
            if(c == 1){
                dp[n] = dp[n-1]+1;
            } else if(c == 2){
                dp[n] = dp[n/2]+1;
            } else if(c == 3){
                dp[n] = dp[n/3]+1;
            }
            return dp[n];
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println(DP(n));
    }
}