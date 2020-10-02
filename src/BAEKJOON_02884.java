package project;

import java.util.Scanner;

public class BAEKJOON_02884 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        int fh = h;
        int fm = m;
        
        fm = fm-45;
        if (fm<0) {
            fh = fh-1;
            if (fh<0){
                fh = 24+fh;
            }
            fm = 60+fm;
        }
        System.out.println(fh+" "+fm);
    }
}
