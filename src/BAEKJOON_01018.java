import java.util.Scanner;

public class BAEKJOON_01018 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //세로개수
        int m = sc.nextInt(); //가로개수
        int c = 999;
        
        char[][] b = new char[n][]; //[세로][가로]
        for(int i = 0;i<n;i++) {
            b[i] = sc.next().toCharArray();
        }
        
        for(int p = 0;p<n-7;p++){
            for(int q = 0;q<m-7;q++){
                char[][] test = new char[n][m];

                for(int i = 0;i<n;i++){
                    for (int j = 0;j<m;j++){
                        test[i][j] = b[i][j];
                    }
                }
                
                int temp = 0;
                for(int i = p;i<p+7;i++){
                    for(int j = q;j<q+7;j++){
                        if(test[i][j]=='W'){
                            if(test[i][j+1]=='W'){
                                test[i][j+1]='B';
                                temp+=1;
                            }
                            if(test[i+1][j]=='W'){
                                test[i+1][j]='B';
                                temp+=1;
                            }
                            if(test[i+1][j+1]=='B'){
                                test[i+1][j+1]='W';
                                temp+=1;
                            }
                        }
                        if (test[i][j]=='B'){
                            if(test[i][j+1]=='B'){
                                test[i][j+1]='W';
                                temp+=1;
                            }
                            if(test[i+1][j]=='B'){
                                test[i+1][j]='W';
                                temp+=1;
                            }
                            if(test[i+1][j+1]=='W'){
                                test[i+1][j+1]='B';
                                temp+=1;
                            }
                        }
                    }
                }
                if(temp>64-temp)    {temp = 64-temp;}
                if(temp<=c)         {c = temp;}
            }
        }
        System.out.println(c);
    }
}