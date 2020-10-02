import java.util.Scanner;

public class BAEKJOON_02446 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        for (int i = a;i>0;i--){
            for (int j = a;j>i;j--){
                System.out.print(" ");
            }
            for (int j = 0;j<2*i-1;j++){
                System.out.print("*");
            }
                System.out.println();
        }
        for (int i = 1;i<a;i++){
            for (int j = a-1;j>i;j--){
                System.out.print(" ");
            }
            for (int j = 0;j<2*i+1;j++){    
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
