import java.util.Scanner;

public class ReverseAnArray_UsingSInglePointer {
    public static int[] reverse(int[] arr ,int i ){
        if(i >= arr.length-i-1) return arr;
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        reverse(arr , i+1 );
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Data: ");
        for(int i = 0 ; i< size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Swap: ");
        for(int i = 0 ; i< size ; i++) {
            System.out.print(arr[i] + " ");
        }
        arr = reverse(arr , 0 );
        System.out.println("\nAfter Swap: ");
        for(int a = 0 ; a< arr.length; a++){
            System.out.print(arr[a]+" ");
        }
    }
}
