import java.io.*;

public class BAEKJOON_09012 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        
        for(int i = 0;i<n;i++){
            String str = bf.readLine();
            char[] l = str.toCharArray();
            int check = 0;
            boolean flag = true;
            
            for(int j = 0;j<l.length;j++){
                if(l[j] == '('){
                    check +=1;
                } else if(l[j] == ')'){
                    check -=1;
                }
                if(check<0){
                    flag = false;
                    break;
                }
            }
            if(check!=0 || !flag){
                bw.write("NO");
                bw.newLine();
            } else {
                bw.write("YES");
                bw.newLine();
            }
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}