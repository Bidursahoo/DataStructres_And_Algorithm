import java.util.Scanner;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n==0){return 0;}
        else if(n==1){return 1;}
        else
            return climbStairs(n-1)+climbStairs(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get stairs");
        int num = sc.nextInt();
        System.out.println("No of steps"+climbStairs(num));
    }
}
