import java.util.Scanner;

public class BAEKJOON_10952 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Boolean FLAG = true;
        int a,b;
        
        while(FLAG){
            a = sc.nextInt();
            b = sc.nextInt();
            
            if(a==0&&b==0){
                FLAG = false;
            } else {
                System.out.println(a+b);
            }
        }
    }
}
