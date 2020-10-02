import java.io.*;
import java.util.StringTokenizer;

public class BAEKJOON_10814 {
    
    public static Member[] src;
    public static Member[] tmp;
    
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());
        src = new Member[n];
        tmp = new Member[n];
        
        for(int i = 0;i<n;i++){
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            src[i] = new Member(age,name);
        }
        bf.close();
        
        MS(0,n-1);
        
        for(int i = 0;i<n;i++){
            src[i].print();
        }
    }
    
    public static void MS(int start, int end){
        if (start<end) {
            int mid = (start+end) / 2;
            MS(start, mid);
            MS(mid+1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p<=mid || q<=end) {
                if (q>end || (p<=mid && check(p, q))) {
                    tmp[idx++] = src[p++];
                } else {
                    tmp[idx++] = src[q++];
                }
            }

            for (int i=start;i<=end;i++) {
                src[i]=tmp[i];
            }
        }
    }
    
    public static boolean check(int p, int q){
        int p1 = src[p].getAge();
        int q1 = src[q].getAge();
        if(p1<q1){return true;}
        else if(p1>q1){return false;}
        else {
            return p<q;
        }
    }
}

class Member{
    
    int age;
    String name;
    
    public Member(int a, String n){
        age = a;
        name = n;
    }
    
    public int getAge(){
        return age;
    }
    
    public void print() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = Integer.toString(age)+" "+name;
        bw.write(s);
        bw.newLine();
        bw.flush();
    }
}