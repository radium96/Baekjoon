import java.util.*;

public class BAEKJOON_02164 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i = 0;i<n;i++){
            q.offer(i+1);
        }
        while(true){
            int tmp1;
            int tmp2;
            tmp1 = q.poll(); //맨위 삭제
            if(q.peek() == null){
                System.out.println(tmp1);
                break;
            }
            tmp2 = q.poll(); //맨위 꺼내기
            if(q.peek() == null){
                System.out.println(tmp2);
                break;
            }
            q.add(tmp2);   //다시 집어넣기
        }
    }
}