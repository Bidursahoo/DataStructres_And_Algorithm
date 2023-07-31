import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class jhbccsbfi {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0 ; i<a ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[a-1]+" "+arr[a-2]);
    }
}
