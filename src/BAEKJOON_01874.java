import java.io.*;
import java.util.*;

public class BAEKJOON_01874 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        int next = 1;
        int count = n*2;
        ArrayList<Integer> c = new ArrayList<Integer>(); //사용한 숫자를 정렬저장
        LinkedList<Integer> ans = new LinkedList<Integer>(); //답 저장,1="+",0="-"
        boolean F = true;  //루프 탈출용도
        boolean N = false;
        Stack<Integer> sta = new Stack<Integer>(); //문제에 이용하는 스택
        
        Loop1 :
        while(n!=0){
            int tmp = Integer.parseInt(bf.readLine()); //타겟숫자 입력
            F=true; //루프 초기화
            while(F){
                if(sta.empty()){  //스택에 숫자가 없는 경우
                    sta.push(next++);
                    ans.add(1);
                } else { //스택에 숫자가 있는 경우
                    int m = sta.peek();
                    if(m>tmp){ //스택 최상단이 입력숫자보다 클경우 "NO"출력
                        bw.write("NO");
                        N=true;
                        break Loop1;
                    }
                    if(m==tmp){ //스택 최상단이 입력숫자와 같을경우
                        sta.pop();
                        ans.add(0);
                        Iterator<Integer> it = c.iterator();
                        int check = 0;
                        while(it.hasNext()){
                            check++;
                            if(it.next()<m){
                                check--;
                                break;
                            }
                        }
                        c.add(check,m);
                        F=false;
                        n--;
                    } else if (m<tmp){ //스택 최상단이 입력숫자보다 작을경우 push
                        sta.push(next++);
                        ans.add(1);
                    }
                }
            }
        }
        
        if(!N){
            for(int i = 0;i<count;i++){
                if(ans.poll().equals(1)){
                    bw.write("+");
                    bw.newLine();
                } else {
                    bw.write("-");
                    bw.newLine();
                }
            }
        }
        
        bf.close();
        bw.flush();
        bw.close();
    }
}