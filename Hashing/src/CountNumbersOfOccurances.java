import java.util.Scanner;

public class CountNumbersOfOccurances {
    public static int apperance(int num[] , int check){
        try{
            return num[check];
        }catch(Exception ex){
//            System.out.println(ex);
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int hashArr[] = new int[size];
        for(int i = 0 ; i< size ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i< size ; i++){
            hashArr[arr[i]] = hashArr[arr[i]]+1;
//            System.out.println(hashArr[i]);
        }
        System.out.println(apperance(hashArr , 45));
    }
}
