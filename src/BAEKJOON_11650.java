import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BAEKJOON_11650 {
    public static int[][] src;
    public static int[][] tmp;
    
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        
        src = new int[n][2];
        tmp = new int[n][2];
        
        for(int i = 0;i<n;i++){
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            for(int j = 0;j<2;j++){
                src[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bf.close();
        
        mergeSort(0,n-1);
        
        for(int i = 0;i<n;i++){
            String s = "";
            for(int j = 0;j<2;j++){
                s = s + Integer.toString(src[i][j]) + " ";
            }
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
                if (q>end || (p<=mid && check(p,q))){
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
        if(src[p][0]!=src[q][0]){
            return src[p][0]<src[q][0];
        } else {
            return src[p][1]<src[q][1];
        }
    }
}