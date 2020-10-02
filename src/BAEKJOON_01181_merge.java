import java.util.Scanner;

public class BAEKJOON_01181_merge {
    public static Scanner sc = new Scanner(System.in);
    public static String[] src;
    public static String[] tmp;
    
    public static void main(String args[]){
        int n = sc.nextInt();
        
        src = new String[n];
        tmp = new String[n];
        
        for(int i = 0;i<n;i++){
            src[i] = sc.next();
            for(int j = 0;j<i;j++){
                if(src[i].equals(src[j]))  {src[i] = "";}
            }
        }
        mergeSort1(0,n-1);
        for(int i = 0;i<n;i++){
            if(src[i].length()==0){continue;}
            System.out.println(src[i]);
        }
    }
    
    public static void mergeSort1(int start, int end){
        if(start<end){
            int mid = (start+end) /2;
            mergeSort1(start, mid);
            mergeSort1(mid+1, end);
            
            int p = start;
            int q = mid +1;
            int idx = p;
            
            while (p<=mid || q<=end){
                if (q>end || (p<=mid && check(p, q))){
                    tmp[idx++] = src[p++];
                } else {
                    tmp[idx++] = src[q++];
                }
            }
            for(int i = start;i<=end;i++){
                src[i] = tmp[i];
            }    
        }
    }
    
    public static boolean check(int p, int q){
        String temp1 = src[p];
        String temp2 = src[q];
        if (temp1.length()>temp2.length()){return false;}
        else if (temp1.length()<temp2.length()){return true;}
        else {
            char[] t1 = temp1.toCharArray();
            char[] t2 = temp2.toCharArray();
            for(int i = 0;i<temp1.length();i++){
                if((int)t1[i]<(int)t2[i]){return true;}
                else if((int)t1[i]>(int)t2[i]){return false;}
            }
        }
        return true;
    }
}