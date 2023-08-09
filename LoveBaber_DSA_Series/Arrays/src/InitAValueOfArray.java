import java.util.Scanner;

public class InitAValueOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        System.out.print("ENter A number to initialize it with: ");
        int ini = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i<size ; i++){
            arr[i] = ini;
        }
        System.out.println("Printing Array:");
        for(int i = 0 ; i<size ; i++){
            System.out.println(arr[i]);
        }
    }
}
