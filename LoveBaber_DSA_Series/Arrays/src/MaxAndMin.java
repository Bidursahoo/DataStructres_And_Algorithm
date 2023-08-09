import java.util.Scanner;

public class MaxAndMin {
    public  static  int maxEle(int  arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public  static  int minEle(int  arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxEle(arr));
        System.out.println(minEle(arr));
    }
}
