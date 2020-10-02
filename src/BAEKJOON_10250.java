import java.util.Scanner;

public class BAEKJOON_10250 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for (int i = 0;i<T;i++){
            int h, w, n;
            
            h = sc.nextInt();
            w = sc.nextInt();
            n = sc.nextInt();
            
            int f = 0;
            int r = 0;
            
            if(n%h==0){f=h;}
            else {f=n%h;}
            if(n%h==0){r=n/h;}
            else {r=n/h+1;}
            
            int rn = f*100+r;
            
            System.out.println(rn);
        }
    }
}