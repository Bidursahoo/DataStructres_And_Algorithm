import java.util.Scanner;

public class Fibinacii {
    public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get stairs");
        int num = sc.nextInt();
        System.out.println("No of steps"+fibonacciRecursion(num));
    }
}
