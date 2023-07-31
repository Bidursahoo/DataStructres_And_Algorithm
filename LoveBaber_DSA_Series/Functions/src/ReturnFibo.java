import java.util.Scanner;

public class ReturnFibo {
    public static int fiboNumber(int n){
        int first  = 0;
        int second  = 1;
        if(n == 1){
            return first;
        } else if (n == 2) {
            return second;
        }else{
            for(int i = 0 ; i< n-2 ; i++){
                int curr = first+second;
                first = second;
                second = curr;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of fibo u need: ");
        int a = sc.nextInt();
        System.out.println(fiboNumber(a));
    }
}
