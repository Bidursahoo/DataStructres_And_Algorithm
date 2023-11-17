import java.util.Scanner;

public class CharCountingOccurances {
    public static int apperance(int num[] , int check){
        try{
            return num[check - 'a'];
        }catch(Exception ex){
//            System.out.println(ex);
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
//        int arr[] = new int[size];
        char[] arr = new char[size];
        int hashArr[] = new int[size];
        for(int i = 0 ; i< size ; i++){
            arr[i] = sc.next().charAt(0);
        }
        for(int i = 0 ; i< size ; i++){
            hashArr[arr[i]-'a'] = hashArr[arr[i]-'a']+1;
//            System.out.println(hashArr[i]);
        }
        System.out.println(apperance(hashArr , 'c'));
    }
}
