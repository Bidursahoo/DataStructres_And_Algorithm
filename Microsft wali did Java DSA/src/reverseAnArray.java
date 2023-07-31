import java.util.Scanner;

public class reverseAnArray {
    static void reverse(int arr[] , int size ){
        int a = 0;
        int b = size-1;
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        print(arr,size);
    }
    static void print(int arr[] , int size){
        System.out.println();
        for(int i = 0 ; i<size ; i++){
            System.out.print(arr[i]+" ");
        }
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
        reverse(arr, size);
    }
}
