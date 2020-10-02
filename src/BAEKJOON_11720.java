import java.util.Scanner;

public class BAEKJOON_11720 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = 0;
        
        char[] cNum = sc.next().toCharArray();
        for(int i = 0;i<n;i++){
            a = a + (int) cNum[i] - 48;
        }
        
        System.out.println(a);
    }
}