import java.util.HashSet;
import java.util.Scanner;

public class getDuplicate {
    static boolean getDuplicate(int arr[] , int size){
        HashSet<Integer> h = new HashSet<>();
        for(int val : arr){
            if(h.contains(val)){
                return true;
            }
            else{
                h.add(val);
            }
        }
        return false;
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
        if(getDuplicate(arr , size)){
            System.out.println("Duplicate is there");
        }else{
            System.out.println("NO duplicates");
        }
    }
}
