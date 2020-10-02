import java.util.Scanner;

public class BAEKJOON_10809 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        
        int[] a = new int[26];
        for(int i = 0;i<26;i++){
            a[i] = -1;
        }
        
        char[] l = S.toCharArray();
        
        for(int i = 0;i<l.length;i++){
            if (l[i]=='a') {
                if(a[0]==-1)  {a[0]=i;}
            } else if (l[i]=='b') {
                if(a[1]==-1)  {a[1]=i;}
            } else if (l[i]=='c') {
                if(a[2]==-1)  {a[2]=i;}
            } else if (l[i]=='d') {
                if(a[3]==-1)  {a[3]=i;}
            } else if (l[i]=='e') {
                if(a[4]==-1)  {a[4]=i;}
            } else if (l[i]=='f') {
                if(a[5]==-1)  {a[5]=i;}
            } else if (l[i]=='g') {
                if(a[6]==-1)  {a[6]=i;}
            } else if (l[i]=='h') {
                if(a[7]==-1)  {a[7]=i;}
            } else if (l[i]=='i') {
                if(a[8]==-1)  {a[8]=i;}
            } else if (l[i]=='j') {
                if(a[9]==-1)  {a[9]=i;}
            } else if (l[i]=='k') {
                if(a[10]==-1)  {a[10]=i;}
            } else if (l[i]=='l') {
                if(a[11]==-1)  {a[11]=i;}
            } else if (l[i]=='m') {
                if(a[12]==-1)  {a[12]=i;}
            } else if (l[i]=='n') {
                if(a[13]==-1)  {a[13]=i;}
            } else if (l[i]=='o') {
                if(a[14]==-1)  {a[14]=i;}
            } else if (l[i]=='p') {
                if(a[15]==-1)  {a[15]=i;}
            } else if (l[i]=='q') {
                if(a[16]==-1)  {a[16]=i;}
            } else if (l[i]=='r') {
                if(a[17]==-1)  {a[17]=i;}
            } else if (l[i]=='s') {
                if(a[18]==-1)  {a[18]=i;}
            } else if (l[i]=='t') {
                if(a[19]==-1)  {a[19]=i;}
            } else if (l[i]=='u') {
                if(a[20]==-1)  {a[20]=i;}
            } else if (l[i]=='v') {
                if(a[21]==-1)  {a[21]=i;}
            } else if (l[i]=='w') {
                if(a[22]==-1)  {a[22]=i;}
            } else if (l[i]=='x') {
                if(a[23]==-1)  {a[23]=i;}
            } else if (l[i]=='y') {
                if(a[24]==-1)  {a[24]=i;}
            } else if (l[i]=='z') {
                if(a[25]==-1)  {a[25]=i;}
            }
        }
        
        for(int i = 0;i<26;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
