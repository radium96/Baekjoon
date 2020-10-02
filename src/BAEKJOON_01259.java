import java.util.Scanner;

public class BAEKJOON_01259 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            if(n==0){break;}
            char[] num = Integer.toString(n).toCharArray();
            boolean F = true;
            
            for(int i = 0;i<num.length/2;i++){
                if(num[i]!=num[num.length-i-1]){
                    F = false;
                    break;
                }
            }
            
            if(F){System.out.println("yes");}
            else {System.out.println("no");}
        }
    }
}
