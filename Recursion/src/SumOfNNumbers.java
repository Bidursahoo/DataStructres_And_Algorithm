import java.util.Scanner;

public class SumOfNNumbers {
//non Parameterized Way

    public static int calculate(int num){
        if(num == 0) return 0;
        return num + calculate(num-1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(calculate(num));
    }
}
