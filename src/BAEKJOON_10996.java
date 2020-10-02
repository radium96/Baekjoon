import java.util.Scanner;

public class BAEKJOON_10996 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        if(a==1){
            System.out.print("*");
        } else {
            for (int i = 0;i<a*2;i++){
                if (i%2==0){
                    for (int j = 0;j<a;j++){
                        if(j%2==0)      {System.out.print("*");}
                        else            {System.out.print(" ");}
                    }       
                } else {
                    for (int j = 0;j<a;j++){
                        if(j%2==0)      {System.out.print(" ");}
                        else            {System.out.print("*");}
                    }       
                }
                System.out.println();
            }
        }
    }
}
