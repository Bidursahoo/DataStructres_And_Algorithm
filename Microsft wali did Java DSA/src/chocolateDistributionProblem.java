import java.util.Arrays;
import java.util.Scanner;

public class chocolateDistributionProblem {
    static int chocolateDistribution(int arr[] , int size , int m){
        Arrays.sort(arr);
        int minSum= Integer.MAX_VALUE;
        for(int i = 0 ; i+m-1<size ; i++){
            if(arr[i+m-1] - arr[i] < minSum){
                minSum = arr[i+m-1] - arr[i];
            }
        }
        return minSum;
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
        System.out.print("Enter the number of students");
        int m = sc.nextInt();
        System.out.println(chocolateDistribution(arr , size , m));
    }
}
