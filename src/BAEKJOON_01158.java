import java.io.*;
import java.util.*;

public class BAEKJOON_01158 {
    
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int c = 0;

        Queue<Integer> q = new LinkedList<Integer>();
        int[] ans = new int[n];
        
        for(int i = 1;i<=n;i++){
            q.add(i);
        }
        
        while(!q.isEmpty()){
            for(int i=0;i<m-1;i++){
                int tmp = q.poll();
                q.add(tmp);
            }
            
            ans[c++]=q.poll();
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 0;i<n;i++){
            sb.append(ans[i]);
            if(i==n-1){
                continue;
            }
            sb.append(", ");
        }
        sb.append(">");
        bw.write(sb.toString());
        
        bf.close();
        bw.flush();
        bw.close();
    }
}