import java.util.LinkedList;
import java.util.Scanner;

public class BAEKJOON_01181 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        LinkedList<String> w = new LinkedList<>();
        
        //리스트에 데이터 추가
        for(int i = 0;i<n;i++){
            w.add(i, sc.next());
        }
        
        //중복되는 데이터 제거
        for(int i = 0;i<w.size();i++){
            String temp = w.get(i);
            for(int j = i+1;j<w.size();j++){
                if(temp.equals(w.get(j))){
                    w.remove(j);
                }
            }
        }
        
        //데이터를 길이순서로 정렬
        for(int i = 0;i<w.size()-1;i++){
            for(int j = i+1;j<w.size();j++){
                String temp1 = w.get(i);
                String temp2 = w.get(j);
                if (temp1.length()>temp2.length()){
                    w.remove(j);
                    w.remove(i);
                    w.add(i, temp2);
                    w.add(j, temp1);
                }
            }
        }
        
        //데이터를 사전순서로 정렬
        for(int i = 0;i<w.size()-1;i++){
            for(int j = i+1;j<w.size();j++){
                String temp1 = w.get(i);
                String temp2 = w.get(j);
                if(temp1.length()!=temp2.length())  {continue;}
                char[] t1 = temp1.toCharArray();
                char[] t2 = temp2.toCharArray();
                for(int k = 0;k<temp1.length();k++){
                    if((int)t1[k] == (int)t2[k])    {continue;}
                    else if((int)t1[k] > (int)t2[k]){
                        w.remove(j);
                        w.remove(i);
                        w.add(i, temp2);
                        w.add(j, temp1);
                        break;
                    } else if((int)t1[k] < (int)t2[k]){break;}
                }
            }
        }
        
        for(int i = 0;i<w.size();i++){
            System.out.println(w.get(i));
        }
    }
}