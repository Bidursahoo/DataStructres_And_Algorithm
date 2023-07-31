import java.util.Scanner;

public class NoOfBits {
    public static int noOfBits(int n){
        int count = 0;
        while(n!=0){
            if((n&1) != 0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int bitsCalculate(int a , int b){
        return noOfBits(a)+noOfBits(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Your Bit is : "+bitsCalculate(a,b));
    }
}
