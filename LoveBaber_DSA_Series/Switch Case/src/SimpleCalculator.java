import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A and B: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter what operation (* , / , % , + , -): ");
        char op = sc.next().charAt(0);
        switch (op){
            case '*':
                System.out.println("Your Ans is "+(a*b));
                break;
            case '/':
                System.out.println("Your Ans is "+(a/b));
                break;
            case '+':
                System.out.println("Your Ans is "+(a+b));
                break;
            case '%':
                System.out.println("Your Ans is "+(a%b));
                break;
            case '-':
                System.out.println("Your Ans is "+(a-b));
                break;
            default:
                System.out.print("Not a valid operation");
                break;
        }
    }
}
