import java.util.Scanner;

public class BAEKJOON_03052 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[10];
        int a=0;

        for(int i = 0;i<10;i++){
            n[i] = sc.nextInt() % 42;
        }
        
        for(int i = 0;i<10;i++){
            for(int j = i+1;j<10;j++){
                if(n[i]==n[j]){
                    if(n[i]>=42){
                    } else {
                        a+=1;
                        n[j]+=42;
                    }
                }
            }
        }
        System.out.println(10-a);
    }
}
