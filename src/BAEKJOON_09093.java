import java.io.*;
import java.util.*;

public class BAEKJOON_09093 {
    
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        
        for(int i = 0;i<n;i++){
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str);
            while(st.hasMoreTokens()){
                String s = st.nextToken();
                char[] l = s.toCharArray();
                
                for(int j = l.length-1;j>=0;j--){
                    bw.write(Character.toString(l[j]));
                }
                bw.write(" ");
            }
            bw.write("\n");
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}