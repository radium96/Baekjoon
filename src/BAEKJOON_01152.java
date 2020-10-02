import java.util.Scanner;

public class BAEKJOON_01152 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        str = str.trim();
        String[] a = str.split(" ");
        
        int w = a.length;
        
        if(str.isEmpty()){
            System.out.println(0);
        } else {
            System.out.println(w);
        }
    }
}

