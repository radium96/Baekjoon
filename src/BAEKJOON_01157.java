import java.util.Scanner;

public class BAEKJOON_01157 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next().toLowerCase();
        
        int[] a = new int[26];
        for(int i = 0;i<26;i++){
            a[i] = 0;
        }
        
        char[] l = S.toCharArray();
        
        for(int i = 0;i<l.length;i++){
            if (l[i]=='a')      {a[0]+=1;}
            else if (l[i]=='b') {a[1]+=1;}
            else if (l[i]=='c') {a[2]+=1;}
            else if (l[i]=='d') {a[3]+=1;}
            else if (l[i]=='e') {a[4]+=1;}
            else if (l[i]=='f') {a[5]+=1;}
            else if (l[i]=='g') {a[6]+=1;}
            else if (l[i]=='h') {a[7]+=1;}
            else if (l[i]=='i') {a[8]+=1;}
            else if (l[i]=='j') {a[9]+=1;}
            else if (l[i]=='k') {a[10]+=1;}
            else if (l[i]=='l') {a[11]+=1;}
            else if (l[i]=='m') {a[12]+=1;}
            else if (l[i]=='n') {a[13]+=1;}
            else if (l[i]=='o') {a[14]+=1;}
            else if (l[i]=='p') {a[15]+=1;}
            else if (l[i]=='q') {a[16]+=1;}
            else if (l[i]=='r') {a[17]+=1;}
            else if (l[i]=='s') {a[18]+=1;}
            else if (l[i]=='t') {a[19]+=1;}
            else if (l[i]=='u') {a[20]+=1;}
            else if (l[i]=='v') {a[21]+=1;}
            else if (l[i]=='w') {a[22]+=1;}
            else if (l[i]=='x') {a[23]+=1;}
            else if (l[i]=='y') {a[24]+=1;}
            else if (l[i]=='z') {a[25]+=1;}
        }
        
        int c = 0;
        boolean F = false;
        
        for(int i = 1;i<26;i++){
            if (a[c]==a[i])     {F = true;}
            else if (a[c]<a[i]) {c=i; F=false;}
        }
        
        char answer = (char)(c+65);
        
        if (F){
            System.out.println("?");
        } else {
            System.out.println(answer);
        }
    }
}
