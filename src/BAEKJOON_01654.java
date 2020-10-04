import java.util.*;
import java.io.*;

public class BAEKJOON_01654 {
    
    private static int max = 0;
    private static int[] l;
    private static long n = 0;
    private static long a = 0;
    
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int k = Integer.parseInt(st.nextToken());
        n = Long.parseLong(st.nextToken());
        
        l = new int[k];
        
        for(int i=0;i<k;i++){
            l[i] = Integer.parseInt(bf.readLine());
            if(l[i]>max){
                max = l[i];
            }
        }
        binarySearch();
        bw.write(Long.toString(a));
        bw.flush();
        bw.close();
    }
    
    public static void binarySearch(){
        long mid;
        long left = 1;
        long right = max;
        
        
        while(right>=left){
            long count = 0;
            
            mid = (right+left)/2;
            
            for(int i=0;i<l.length;i++){
                count += l[i]/mid;
            }
            
            if(count<n){
                right = mid-1;
            }
            
            if(count>=n){
                left = mid+1;
                if(a<mid){
                    a=mid;
                }
            }
        }
    }
}