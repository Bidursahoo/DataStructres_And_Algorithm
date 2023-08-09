import java.util.Scanner;

public class PeekFind {
    public static int findPeakElement(int[] nums) {
//        int a=0;
//        int b=nums.length-1;
//        int max = 0;
//        while(a <= b){
//            if(nums[a] >= max){
//                max = a;
//                System.out.println( "In First"+max);
//            }
//            if(nums[b] >= max){
//                max = b;
//                System.out.println( "In Second"+max);
//            }
//            a++;
//            b--;
//        }
//        return max;
        int max = 0;
        for(int i = 0 ; i<nums.length/2 ; i++){
            if(nums[i] >= max){
                max = i;
            }
            if(nums[nums.length-1-i] >= max){
                max = nums.length-1-i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the data:");
        for(int i = 0; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findPeakElement(arr));
    }
}
