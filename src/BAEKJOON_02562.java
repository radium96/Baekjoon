import java.util.Scanner;

public class BAEKJOON_02562{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] nums = new int[9];
        
        for(int i = 0;i<9;i++){
            nums[i]=sc.nextInt();
        }
        
        int max = nums[0];
        int index = 1;
        
        for(int i = 1;i<9;i++){
            if (max<nums[i]){
                max = nums[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}