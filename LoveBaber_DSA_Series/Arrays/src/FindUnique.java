import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FindUnique {
    private static Map unique(int arr[]){
        Map map = new HashMap();
        for(int i = 0 ; i<arr.length ; i++){
            map.put(arr[i] , 0);
        }
        return map;
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
        Map mm = unique(arr);
        System.out.println(mm);
    }
}
