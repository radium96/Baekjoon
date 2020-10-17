import java.io.*;
import java.util.*;

public class BAEKJOON_01929 {
    
    public static boolean[] p;
    
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                
        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        p = new boolean[m+1];
        
        P();
        
        for(int i = n;i<=m;i++){
            if(!p[i]){
                bw.write(Integer.toString(i)+"\n");
            }
        }
        
        bf.close();
        bw.flush();
        bw.close();
    }
    
    public static void P(){
        p[1] = true;
        
        for(int i = 2;i<p.length;i++){
            for(int j = 2;i*j<p.length;j++){
                p[i*j] = true;
            }
        }
    }
}