import java.io.*;
import java.util.Scanner;

public class BAEKJOON_02751 {
    public static int[] src;
    public static int[] tmp;
    
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        
        src = new int[n];
        tmp = new int[n];
        
        for(int i = 0;i<n;i++){
            src[i] = Integer.parseInt(bf.readLine());
        }
        bf.close();
        
        mergeSort(0,n-1);
        
        for(int i = 0;i<n;i++){
            String s = Integer.toString(src[i]);
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    
    public static void mergeSort(int start, int end){
        if(start<end){
            int mid = (start+end) /2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);
            
            int p = start;
            int q = mid +1;
            int idx = p;
            
            while (p<=mid || q<=end){
                if (q>end || (p<=mid && src[p]<src[q])){
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
}