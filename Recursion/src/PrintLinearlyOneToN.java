import java.util.Scanner;

public class PrintLinearlyOneToN {

    public static void printNum(int num, int endCondition){
        if(num == endCondition+1) return;
        System.out.println(num++);
        printNum(num , endCondition);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int endCondition = sc.nextInt();
        printNum(num , endCondition);
    }
}
