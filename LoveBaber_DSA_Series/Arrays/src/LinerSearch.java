import java.util.Scanner;

public class LinerSearch {
    private static  String linearSearch(int arr[] , int a){
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]  == a){
                return "Found !!";
            }
        }
        return "Not Found :(";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();

        System.out.println(linearSearch(arr , search));
    }
}
