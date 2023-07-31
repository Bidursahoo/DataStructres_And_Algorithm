import java.util.Scanner;

public class ExitInfiniteLoopSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Printing Default...\n...");
                    break;
            }
        }
    }
}
