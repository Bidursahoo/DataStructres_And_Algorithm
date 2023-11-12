import java.util.Scanner;

public class SumOfNNumberParameters {
//Parameterized Way

    public static int calculate(int num , int sum){
        if(num == 0) return sum;
        return calculate(num-1 , sum+num);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(calculate(num , 0));
    }
}
