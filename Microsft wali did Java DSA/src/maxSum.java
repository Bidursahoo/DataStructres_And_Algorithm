import java.util.Scanner;

public class maxSum {
    static int maxSum(int arr[] , int size){
//        int sum = arr[0];
//        for(int i = 1 ; i<size ; i++){
//            System.out.println(sum);
//            if(sum + arr[i] < sum){
//                sum = arr[i];
//            }else{
//                sum +=arr[i];
//            }
//        }
//        return sum;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0 ; i<size ; i++){
            currSum = currSum + arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of array: ");
        for(int i=0 ; i <size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSum(arr , size));
//        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
//        int size = 9;
//        System.out.println(maxSum(arr , size));
    }
}
