import java.util.Scanner;

public class BAEKJOON_02527 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Check C = new Check();
        
        int a, b, c, d, e, f, g, h;
        char code1;

        for(int i = 0;i<4;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();
            f = sc.nextInt();
            g = sc.nextInt();
            h = sc.nextInt();
            code1 = C.check(a,b,c,d,e,f,g,h);
            System.out.print(code1);
            if(i!=3){System.out.println();}
        }
    }
}

class Check{
    char check(int a, int b, int c, int d, 
               int e, int f, int g, int h){
        
        char code='a';
        int x1, y1, p1, q1;
        int x2, y2, p2, q2;

        x1 = a;
        y1 = b;
        p1 = c;
        q1 = d;
        x2 = e;
        y2 = f;
        p2 = g;
        q2 = h;
        
        if ((p2<x1)||(p1<x2)||(q2<y1)||(q1<y2)){
            code = 'd';
        } else if (((x1==p2)&&(y1==q2))||((x2==p1)&&(y1==q2))||
                  ((x2==p1)&&(y2==q1))||((x1==p2)&&(y2==q1))) {
            code = 'c';
        } else if ((y1==q2)||(y2==q1)||(x1==p2)||(x2==p1)) {
            code = 'b';
        } else {
            code = 'a';
        }
        
        return code;
    }
}
