import java.util.Scanner;

public class ReverseArray {
    public  static int[] reverse(int arr[]){
        for(int i = 0 ; i<arr.length/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing");
        arr = reverse(arr);
        for(int i = 0 ; i<size ; i++){
            System.out.println(arr[i]);
        }
    }
}
