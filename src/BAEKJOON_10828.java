import java.io.*;
import java.util.*;

public class BAEKJOON_10828{
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> sta = new Stack<Integer>();
        
        for(int i = 0;i<n;i++){
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            String o = st.nextToken();
            if(o.equals("push")){
                int m = Integer.parseInt(st.nextToken());
                sta.add(m);
            } else if(o.equals("pop")){
                int m;
                if(sta.isEmpty()){
                    m = -1;   
                } else {
                    m = sta.pop();
                }
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("size")){
                int m = sta.size();
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("empty")){
                int m;
                if(sta.isEmpty()){
                    m = 1;   
                } else {
                    m = 0;
                }
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("top")){
                int m;
                if(sta.isEmpty()){
                    m = -1;   
                } else {
                    m = sta.peek();
                }
                bw.write(Integer.toString(m));
                bw.newLine();
            }
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}