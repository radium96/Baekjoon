import java.util.*;
import java.io.*;

public class BAEKJOON_01002 {
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        for(int i = 0;i<n;i++){
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str);
        
            double x1 = Integer.parseInt(st.nextToken());
            double y1 = Integer.parseInt(st.nextToken());
            double r1 = Integer.parseInt(st.nextToken());
            double x2 = Integer.parseInt(st.nextToken());
            double y2 = Integer.parseInt(st.nextToken());
            double r2 = Integer.parseInt(st.nextToken());
        
            double R = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
            double c = r1+r2;
        
            if((x1==x2)&&(y1==y2)){
                if(r1==r2){
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write("0");
                    bw.newLine();
                }
            } else if (R==r1){
                if(r2==r1*2){
                    bw.write("1");
                    bw.newLine();
                } else if (r2<r1*2){
                    bw.write("2");
                    bw.newLine();
                } else if (r2>r1*2){
                    bw.write("0");
                    bw.newLine();
                }
            } else if (R==r2){
                if(r1==r2*2){
                    bw.write("1");
                    bw.newLine();
                } else if (r1<r2*2){
                    bw.write("2");
                    bw.newLine();
                } else if (r1>r2*2){
                    bw.write("0");
                    bw.newLine();
                }
            } else if(R<r1){
                if(R+r2==r1){
                    bw.write("1");
                    bw.newLine();
                } else if(R+r2>r1){
                    if(r2-R==r1){
                        bw.write("1");
                        bw.newLine();
                    } else if(r2-R>r1){
                        bw.write("0");
                        bw.newLine();
                    } else if(r2-R<r1){
                        bw.write("2");
                        bw.newLine();
                    }
                } else if(R+r2<r1){
                    bw.write("0");
                    bw.newLine();
                }
            } else if (R<r2){
                if(R+r1==r2){
                    bw.write("1");
                    bw.newLine();
                } else if(R+r1>r2){
                    if(r1-R==r2){
                        bw.write("1");
                        bw.newLine();
                    } else if(r1-R>r2){
                        bw.write("0");
                        bw.newLine();
                    } else if(r1-R<r2){
                        bw.write("2");
                        bw.newLine();
                    }
                } else if(R+r1<r2){
                    bw.write("0");
                    bw.newLine();
                }
            } else {
                if(R>c){
                    bw.write("0");
                    bw.newLine();
                } else if(R==c){
                    bw.write("1");
                    bw.newLine();
                } else if(R<c){
                    if(R+r2==r1){
                        bw.write("1");
                        bw.newLine();
                    } else if(R+r1==r2){
                        bw.write("1");
                        bw.newLine();
                    } else if(R+r1<r2){
                        bw.write("0");
                        bw.newLine();
                    } else if(R+r2<r1){
                        bw.write("0");
                        bw.newLine();
                    } else {
                        bw.write("2");
                        bw.newLine();
                    }
                }
            }
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}