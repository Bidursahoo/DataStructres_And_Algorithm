import java.util.Scanner;

public class SwapAlternet {
    private static int[] swapAlternate(int arr[]){
        if(arr.length == 0){
            return arr;
        }
        for(int i = 1 ; i<arr.length ; i+=2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
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
        arr = swapAlternate(arr);
        for(int i = 0 ; i<size ; i++){
            System.out.println(arr[i]);
        }
    }
}
