import java.util.Scanner;

public class BAEKJOON_02523 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        for(int i = 0;i<a;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = a-1;i>0;i--){
            for(int j = i-1;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
