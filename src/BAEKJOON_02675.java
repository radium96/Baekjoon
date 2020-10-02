import java.util.Scanner;

public class BAEKJOON_02675 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        for (int i = 0;i<test;i++){
            int a = sc.nextInt();
            String S = sc.nextLine().trim();
            char[] l = S.toCharArray();
            for (int j = 0;j<l.length;j++){
                for (int k = 0;k<a;k++){
                    System.out.print(l[j]);
                }
            }
            System.out.println();
        }
    }
}