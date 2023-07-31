import java.util.Scanner;

public class searchRoattedArray {
    static int searchRotate(int arr[] , int target , int size){
        for(int i = 0 ; i<size ; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
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
        System.out.print("Enter the target to find");
        int target = sc.nextInt();
        System.out.println(searchRotate(arr , target , size));
    }
}
