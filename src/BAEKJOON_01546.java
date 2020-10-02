import java.util.Scanner;

public class BAEKJOON_01546 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[] s = new double[n];
        double m = 0;
        double a = 0;
        
        for(int i = 0;i<s.length;i++){
            s[i] = sc.nextInt();
            if(s[i]>m)    {m=s[i];}
        }
        
        for(int i = 0;i<s.length;i++){
            double temp = s[i];
            s[i] = (temp/m)*100;    
            a+=s[i];
        }
        
        System.out.println(a/s.length);
    }
}