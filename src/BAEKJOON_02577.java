import java.util.Scanner;

public class BAEKJOON_02577 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int N = a*b*c;
        
        String n = Integer.toString(N);
        
        int[] C = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        char[] num = n.toCharArray();
        
        for(int i = 0;i<num.length;i++){
            if(num[i] == '0')             {C[0]+=1;}
            else if(num[i] == '1')        {C[1]+=1;}
            else if(num[i] == '2')        {C[2]+=1;}
            else if(num[i] == '3')        {C[3]+=1;}
            else if(num[i] == '4')        {C[4]+=1;}
            else if(num[i] == '5')        {C[5]+=1;}
            else if(num[i] == '6')        {C[6]+=1;}
            else if(num[i] == '7')        {C[7]+=1;}
            else if(num[i] == '8')        {C[8]+=1;}
            else if(num[i] == '9')        {C[9]+=1;}
        }
        
        for(int i = 0;i<10;i++){
            System.out.println(C[i]);
        }
        
    }
}