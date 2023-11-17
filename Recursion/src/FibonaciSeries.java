import java.util.Scanner;

public class FibonaciSeries {
    public static int fibo(int num){
        if(num <= 1) return num;
        return fibo(num-1) + fibo(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        System.out.print("0 1 ");
        System.out.println(fibo(num));
    }
}
