import java.util.Scanner;

public class BAEKJOON_01436 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();       
        int name = 660;
        String na="";
        while(n!=0){
            name++;
            String tmp = Integer.toString(name);
            int check = tmp.indexOf("666");
            if(check != -1){
                na=tmp;
                n--;
            }
        }
        System.out.println(na);
    }
}