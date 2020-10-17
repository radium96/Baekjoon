import java.io.*;
import java.util.*;

public class BAEKJOON_17413 {
    
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = bf.readLine();
        char[] q = s.toCharArray();
        Queue<Character> qu = new LinkedList<Character>();
        
        for(int i = 0;i<q.length;i++){
            qu.add(q[i]);
        }
        
        Stack<Character> tmp = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        boolean F1 = true; //<>  체크
        int n = 0;
        
        for(int ii = 0;ii<q.length;ii++){
            if(qu.peek().equals('<')){
                F1 = false;
                if(!tmp.isEmpty()){
                    for(int i = 0;i<n;i++){
                        sb.append(tmp.pop());
                    }
                    n = 0;
                }
                sb.append(qu.poll());
            } else if(qu.peek().equals('>')){
                F1 = true;
                sb.append(qu.poll());
            } else {
                if(F1){
                    if(q.length-1==ii){
                        sb.append(qu.poll());
                        for(int i = 0;i<n;i++){
                            sb.append(tmp.pop());
                        }
                    } else if((qu.peek().equals(' '))){
                        for(int i = 0;i<n;i++){
                            sb.append(tmp.pop());
                        }
                        n = 0;
                        sb.append(qu.poll());
                    } else {
                        tmp.add(qu.poll());
                        n++;
                    }
                } else {
                    sb.append(qu.poll());
                }
            }
        }
        
        
        bf.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
        
        
        
    }
}