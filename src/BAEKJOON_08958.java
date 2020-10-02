import java.util.Scanner;

public class BAEKJOON_08958{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i = 0;i<a;i++){
            String q = sc.next();
            char[] an = q.toCharArray();
            int[] score = new int[an.length];
            for(int j = 0;j<an.length;j++){
                if((j==0)&&(an[j]=='O')){
                    score[j] = 1;
                } else if ((j==0)&&(an[j]=='X')){
                    score[j] = 0;
                } else if (an[j]=='O'){
                    score[j] = score[j-1]+1;
                } else if (an[j]=='X'){
                    score[j] = 0;
                }
            }
            int result = 0;
            for (int j = 0;j<an.length;j++){
                result += score[j];
            }
            System.out.println(result);
        }
    }
}
