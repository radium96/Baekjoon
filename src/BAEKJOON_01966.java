import java.io.*;
import java.util.*;

public class BAEKJOON_01966 {
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(bf.readLine());
        
        for(int i = 0;i<t;i++){
            
            String str = bf.readLine();
            StringTokenizer st1 = new StringTokenizer(str);
            
            int n = Integer.parseInt(st1.nextToken());
            int m = Integer.parseInt(st1.nextToken());
            int count = 0;
            boolean F = true;
            
            Queue<Integer> ans = new LinkedList<Integer>();
            
            str = bf.readLine();
            StringTokenizer st2 = new StringTokenizer(str);
            
            for(int j = 0;j<n;j++){
                if(m!=j){
                    ans.add(Integer.parseInt(st2.nextToken()));
                } else {
                    ans.add(Integer.parseInt(st2.nextToken())*10);
                }
            }
            
            while(F){
                int tmp = ans.size();
                int max = 0;
                for(int j = 0;j<tmp;j++){
                    int tm = ans.poll();
                    if(tm>=10){
                        tm=tm/10;
                        if(max<tm){
                            max=tm;
                        }
                        tm=tm*10;
                    } else {
                        if(max<tm){
                            max=tm;
                        }
                    }
                    ans.add(tm);
                }
                int tm = ans.poll();
                if(tm>=10){
                    tm=tm/10;
                    if(tm==max){
                        F = false;
                        count++;
                    } else {
                        tm=tm*10;
                        ans.add(tm);
                    }
                } else {
                    if(tm==max){
                        count++;
                    } else {
                        ans.add(tm);
                    }
                }
            }
            
            bw.write(Integer.toString(count)+"\n");
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}