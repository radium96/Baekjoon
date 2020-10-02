package project;

import java.util.*;

public class BAEKJOON_14681{
    public static void main(String args[]){
        int x,y,Q;
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>0 && y>0)          {Q=1;}
        else if (x<0 && y>0)    {Q=2;}
        else if (x<0 && y<0)    {Q=3;}
        else                    {Q=4;}
        
        System.out.println(Q);
    }
}