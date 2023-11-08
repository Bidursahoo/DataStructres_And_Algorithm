import java.util.Scanner;

public class PrintOneToN {
    //using back tracking

    //backtracking function
    public void printInBackTracking(int num){
        if(num < 1) return;
        printInBackTracking(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintOneToN obj = new PrintOneToN();
        obj.printInBackTracking(num);
    }
}
