import java.util.Scanner;

public class BAEKJOON_02920 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[8];
        
        for(int i=0;i<8;i++){
            a[i] = sc.nextInt();
        }
        
        int temp = 0;
        int gap = a[0]-a[1];
        
        if (gap == -1){
            temp=0;
            for(int i=1;i<7;i++){
                if (a[i]-a[i+1]!=-1) {
                    temp=2;
                    break;
                }
            }
        } else if (gap == 1){
            temp=1;
            for(int i=1;i<7;i++){
                if (a[i]-a[i+1]!=1) {
                    temp = 2;
                    break;
                }
            }
        } else {temp = 2;}
        
        if(temp==0)         {System.out.println("ascending");}
        else if(temp==1)    {System.out.println("descending");}
        else if(temp==2)    {System.out.println("mixed");}
        else                {System.out.println("???");}
    }
}
