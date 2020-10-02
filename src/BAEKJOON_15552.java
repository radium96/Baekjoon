import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON_15552 {    
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        
        for(int i = 0;i<n;i++){
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String s = Integer.toString(a+b);
            bw.write(s);
            bw.newLine();
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}