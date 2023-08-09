import java.util.Scanner;

public class SumOfAllElements {
    public int sumOfElements(int arr[]){
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        SumOfAllElements s = new SumOfAllElements();
        System.out.println(s.sumOfElements(arr));
    }
}
