import java.io.*;
import java.util.*;
public class BAEKJOON_10816 {
    
    public class Node{
        private int data;
        private int count;
        private Node left;
        private Node right;

        public Node(int d){
            data = d;
            count = 0;
            setLeft(null);
            setRight(null);
        }

        public void setLeft(Node n){
            left = n;
        }
        
        public void setRight(Node n){
            right = n;
        }
    
        public Node getLeft(){
            return left;
        }
    
        public Node getRight(){
            return right;
        }
    
        public int getData(){
            return data;
        }

        public int getCount(){
            return count;
        }

        public void addCount(){
            count += 1;
        }
    }
    
    public Node root;
    public BAEKJOON_10816() {
        this.root = null;
    }
    
    public void insert(int n){
        Node newNode = new Node(n);
        if(root == null){
            root = newNode;
            root.addCount();
            return;
        }
        Node now = root;
        Node parent = null;
        while(true){
            parent = now;
            if(now.getData()==n){
                now.addCount();
                return;
            }else if(now.getData()<n){
                now = now.getRight();
                if(now == null){
                    parent.setRight(newNode);
                    parent.getRight().addCount();
                    return;
                }
            } else {
                now = now.getLeft();
                if(now == null){
                    parent.setLeft(newNode);
                    parent.getLeft().addCount();
                    return;
                }
            }
        }
    }
    
    public int search(int n){
        Node now = root;
        while(now != null){
            if(now.getData() == n){
                return now.getCount();
            } else if (now.getData()<n){
                now = now.getRight();
            } else {
                now = now.getLeft();
            }
        }
        return 0;
    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BAEKJOON_10816 b = new BAEKJOON_10816();
        
        int n = Integer.parseInt(bf.readLine());
        
        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        for(int i = 0;i<n;i++){
            int tmp = Integer.parseInt(st.nextToken());
            b.insert(tmp);
        }
        
        int m = Integer.parseInt(bf.readLine());
        
        str = bf.readLine();
        bf.close();
        StringTokenizer st1 = new StringTokenizer(str);
        for(int i = 0;i<m;i++){
            int tmp = Integer.parseInt(st1.nextToken());
            bw.write(Integer.toString(b.search(tmp)) + " ");
        }
        bw.flush();
        bw.close();
    }
}