import java.io.*;
import java.util.*;

public class BAEKJOON_10866{
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        Deque<Integer> d = new LinkedList<Integer>();
        
        for(int i = 0;i<n;i++){
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            String o = st.nextToken();
            if(o.equals("push_front")){
                int m = Integer.parseInt(st.nextToken());
                d.addFirst(m);
            } else if(o.equals("push_back")){
                int m = Integer.parseInt(st.nextToken());
                d.addLast(m);
            } else if(o.equals("pop_front")){
                int m;
                if(d.isEmpty()){
                    m = -1;
                } else {
                    m = d.pollFirst();
                }
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("pop_back")){
                int m;
                if(d.isEmpty()){
                    m = -1;
                } else {
                    m = d.pollLast();
                }
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("size")){
                int m = d.size();
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("empty")){
                int m;
                if(d.isEmpty()){
                    m = 1;
                } else {
                    m = 0;
                }
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("front")){
                int m;
                if(d.isEmpty()){
                    m = -1;
                } else {
                    m = d.peekFirst();
                }
                bw.write(Integer.toString(m));
                bw.newLine();
            } else if(o.equals("back")){
                int m;
                if(d.isEmpty()){
                    m = -1;
                } else {
                    m = d.peekLast();
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