import java.util.Scanner;

public class BAEKJOON_10818 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n,M,m;
        
        n = sc.nextInt();
        
        int[] num = new int[n];
        
        for(int i = 0;i<n;i++){
            num[i]=sc.nextInt();
        }
        
        M = num[0];
        m = num[0];
        
        for(int i = 0;i<n;i++){
            if(num[i]<m)        {m=num[i];}
            if(num[i]>M)        {M=num[i];}
        }
        
        System.out.println(m+" "+M);
    }
}
