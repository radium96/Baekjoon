import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON_01978 {
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        int c = 0;
        boolean F = false;
        int[] num = new int[n];
        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        for(int i = 0; i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0;i<n;i++){
            F = false;
            if((num[i]==2)||(num[i]==3)){
                c++;
                continue;
            }
            for(int j = 2;j<(num[i]/2)+1;j++){
                F = true;
                if(num[i]%j==0){
                    F = false;
                    break;
                }
            }
            if(F){
                c++;
            }
        }
        bw.write(Integer.toString(c));
        bf.close();
        bw.flush();
        bw.close();
    }
}