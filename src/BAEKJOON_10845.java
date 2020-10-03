import java.io.*;
import java.util.*;

public class BAEKJOON_10845{
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        Queue<Integer> q = new LinkedList<Integer>();
        int l = 0;
        
        for(int i = 0;i<n;i++){
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            String o = st.nextToken();
            if(o.equals("push")){
                int m = Integer.parseInt(st.nextToken());
                q.add(m);
                l = m;
            } else if(o.equals("pop")){
                int m;
                if(q.isEmpty()){
                    m = -1;
                } else {
                    m = q.poll();
                }
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("size")){
                int m = q.size();
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("empty")){
                int m;
                if(q.isEmpty()){
                    m = 1;
                } else {
                    m = 0;
                }
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("front")){
                int m;
                if(q.isEmpty()){
                    m = -1;
                } else {
                    m = q.peek();
                }
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("back")){
                int m;
                if(q.isEmpty()){
                    m = -1;
                } else {
                    m = l;
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