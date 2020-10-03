import java.io.*;
import java.util.*;

public class BAEKJOON_11866 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = 0;
        
        Queue<Integer> q = new LinkedList<Integer>();
        int[] a = new int[n];
        
        for(int i = 0;i<n;i++){
            q.add(i+1);
        }
        
        while(c!=n){
            for(int i = 0;i<k-1;i++){
                int tmp = q.poll();
                q.add(tmp);
            }
            a[c++] = q.poll();
        }
        
        bw.write("<");
        for(int i = 0;i<n;i++){
            if(i==n-1){
                bw.write(Integer.toString(a[i]) + ">");
            } else {
                bw.write(Integer.toString(a[i]) + ", ");
            }
        }
        
        bw.flush();
        bw.close();
    }
}